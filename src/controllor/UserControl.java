package controllor;

import domain.GoodCatory;
import domain.Goods;
import domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import service.GoodService;
import service.OrderService;
import service.UserService;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.List;
import java.util.Map;

@Controller
public class UserControl {
    @Autowired
    private UserService service;

    @Autowired
    private GoodService goodService;

    @Autowired
    private OrderService orderService;

    public void setUserService(UserService userService) {
        this.service = userService;
    }

    @RequestMapping("/login.action")
    public void login(HttpServletRequest request, HttpServletResponse response, User user) throws ServletException, IOException {
        //登陆判断
        if (service.login(user.getUname(),user.getPwd())!=null){

//            查询成功，登陆成功
            HttpSession session=request.getSession();
//            放置session内
            session.setAttribute("user",user);
            request.getRequestDispatcher("/mainTest.action").forward(request,response);
        }else{

            request.setAttribute("error","用户名或密码错误");
            request.getRequestDispatcher("/jsp/login.jsp").forward(request,response);
        }


    }
    @RequestMapping("/main.action")
//    直接接收请求的参数，封死到形参里，建议以对象的方式来接受,新参和请求的参数名一致

    public void main(HttpServletRequest request,HttpServletResponse response,String catory)
            throws ServletException, IOException {
//        首页controller
//        给首页准备数据，放置域对象里，供首页的jsp使用
//        商品管理系统，将所有的商品显示在首页
//        以分类的形式显示
//        商品的类别，
        System.out.println(catory);
        List<GoodCatory> goodCatories=goodService.selectCatorys();
        request.getServletContext().setAttribute("goodCatories",goodCatories);


        //刚开始加载，默认10号类型的商品显示
        if (catory==null){
            catory="10";
        }
//        将当前种类id放置到context域中
        request.getServletContext().setAttribute("catoryId",catory);
//        每一类商品的列表(点哪个菜单，传进来)
        List<Goods> goodsList=goodService.selectGoodByCatory(catory);
        request.setAttribute("goodsList",goodsList);
//        /jsp/main.jsp   去除前缀  去除后缀
        request.getRequestDispatcher("/jsp/main.jsp").forward(request,response);
    }

    @RequestMapping("/loginOut.action")
    public void loginOut(HttpServletRequest request,HttpServletResponse response) throws ServletException, IOException {
        HttpSession session=request.getSession();
        session.removeAttribute("user");
        request.getRequestDispatcher("/jsp/login.jsp").forward(request,response);
    }

    @RequestMapping("/goodInfor.action")
    public void goodInfor(HttpServletRequest request,HttpServletResponse response,String gid) throws ServletException, IOException {
//        获得请求的参数
        Goods goods=goodService.selectById(gid);
        request.setAttribute("good",goods);
        request.getRequestDispatcher("/jsp/goodInfor.jsp").forward(request,response);


    }

    @RequestMapping("/shop.action")
    public void shop(HttpServletRequest request, HttpServletResponse response, Map<Goods,Integer> gmap) throws ServletException, IOException {
//        获得请求的参数
        User user= (User) request.getSession().getAttribute("user");
        if (user!=null){
            if (orderService.addOrder(user.getUname(),gmap)){
//                跳转到成功页面
            }
        }else {

//            没有登录
            request.getRequestDispatcher("/jsp/login.jsp").forward(request,response);
        }

    }
}
