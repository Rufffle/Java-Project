
package pkgfinal;

import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;

public class MobileDeviceLayout {
    
    private Pane mobileDeviceLayout;
    
    public MobileDeviceLayout(){
        Button save = new Button("Save");
        save.setId("save-btn");
        
        Label model = new Label("Model");
        Label IMEI = new Label("IMEI Number");
        Label dateOfManufacture = new Label("Date Of Manufacture");
        Label brand = new Label("Brand");
        Label importer = new Label("Importer");
        Label deviceType = new Label("Device Type");
        Label deviceCategory = new Label("Device Category");
        
        TextField modelField = new TextField();
        modelField.setId("model-field");
        
        TextField IMEIField = new TextField();
        modelField.setId("IMEI-field");
        
        TextField dateOfmanufactureField = new TextField();
        modelField.setId("date-of-manufacture-field");
        
        TextField brandField = new TextField();
        modelField.setId("brand-field");
        
        TextField imporetrField = new TextField();
        modelField.setId("importer-field");
        
        TextField deviceTypeField = new TextField();
        deviceTypeField.setId("device-type-field");
        
        TextField deviceCategoryField = new TextField();
        deviceCategoryField.setId("device-category-field");
        
        HBox modelFieldLayout = new HBox();
        modelFieldLayout.setSpacing(20);
        modelFieldLayout.getChildren().addAll(model,modelField);
        
        HBox IMEIFieldLayout = new HBox();
        IMEIFieldLayout.setSpacing(20);
        IMEIFieldLayout.getChildren().addAll(IMEI,IMEIField);
        
        HBox dateOfManufactureFieldLayout = new HBox();
        dateOfManufactureFieldLayout.setSpacing(20);
        dateOfManufactureFieldLayout.getChildren().addAll(dateOfManufacture,dateOfmanufactureField);
        
        HBox brandFieldLayout = new HBox();
        brandFieldLayout.setSpacing(20);
        brandFieldLayout.getChildren().addAll(brand,brandField);
        
        HBox importerFieldLayout = new HBox();
        importerFieldLayout.setSpacing(20);
        importerFieldLayout.getChildren().addAll(importer,imporetrField);
        
        HBox deviceTypeFieldLayout = new HBox();
        deviceTypeFieldLayout.setSpacing(20);
        deviceTypeFieldLayout.getChildren().addAll(deviceType,deviceTypeField);
        
        HBox deviceCategoryFieldLayout = new HBox();
        deviceCategoryFieldLayout.setSpacing(20);
        deviceCategoryFieldLayout.getChildren().addAll(deviceCategory,deviceCategoryField);
        
        HBox buttonLayout = new HBox();
        buttonLayout.setSpacing(30);
        buttonLayout.getChildren().add(save);
        
        GridPane parentLayout = new GridPane();
        
        this.mobileDeviceLayout = parentLayout;
    }
    
    public Pane getMobileDevicInformationUI(){
        return mobileDeviceLayout;
    }
    
}
