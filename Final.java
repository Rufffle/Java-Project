package pkgfinal;

import java.io.FileNotFoundException;

public class Final implements Comparable<MobileDeviceFormation>{

    public static void main(String[] args) throws FileNotFoundException {
        MobileDeviceFormation device1 = new MobileDeviceFormation();
        MobileDeviceFormation device2 = new MobileDeviceFormation();
        device1.setIMEI("123456789012456");
        //System.out.println(device1.toString());;
        device2.setIMEI("123456789012456");
        device2.setModel("Redmi");
        device2.setDeviceCategory("Smartphones");
        device2.setImporter("Xiome");
        device2.setBrand("MI");
        
        
        
        
        FileIOMobiuleDeviceInformation file = new FileIOMobiuleDeviceInformation();
        file.saveToFile(device2);
    }


    @Override
    public int compareTo(MobileDeviceFormation o) {
        return 0;        
    }

}
