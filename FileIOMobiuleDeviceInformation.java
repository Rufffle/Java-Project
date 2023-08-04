
package pkgfinal;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class FileIOMobiuleDeviceInformation {
    
    public static void saveToFile(MobileDeviceFormation object) throws FileNotFoundException{
        String imei = object.getIMEI();
        String pathName = imei.concat(".txt");
        File file = new File(pathName);
        PrintWriter output = new PrintWriter(file);
        
        output.print(object.getModel()+"\t"+object.getIMEI()+"\t"+object.getDateOfManufacture()+"\t"+object.getBrand()
                +"\t"+object.getDeviceCategory()+"\t"+object.getDeviceType());
        
        output.close();
    }
    public static MobileDeviceFormation readFromFile(String filePath) throws FileNotFoundException{
        File file = new File("C:\\Users\\LIB-609\\Documents\\NetBeansProjects\\Final+"+filePath);
        Scanner input = new Scanner(file);
        
        MobileDeviceFormation device = new MobileDeviceFormation();
        while(input.hasNext()){
            String model = input.next();
            device.setModel(model);
            String IMEI = input.next();
            device.setIMEI(IMEI);
            String brand = input.next();
            device.setBrand(brand);
            String importer = input.next();
            device.setImporter(importer);
            String deviceType = input.next();
            device.setDeviceType(deviceType);
            String deviceCategory = input.next();
            device.setDeviceCategory(deviceCategory);
        }
        
        input.close();
        return device;
        
    }
}
