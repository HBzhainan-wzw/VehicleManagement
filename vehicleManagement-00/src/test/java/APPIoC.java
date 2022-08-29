import com.wzw.service.DriverService;
import com.wzw.service.VehicleService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class APPIoC {
    public static void main(String[] args) {
        //    加载配置文件，获取 IoC 容器
        ApplicationContext app = new ClassPathXmlApplicationContext("applicationContext.xml");
        //    获取 Bean
        DriverService driverService = (DriverService) app.getBean("DriverService");
        VehicleService vehicleService = (VehicleService) app.getBean("VehicleService");

        driverService.driverRegister(0, "123", "Visa", "james", "MUT644", "CA",
                "FICO", "typeA", "1123", "typeB", "active");
        System.out.println("finished");
    }
}
