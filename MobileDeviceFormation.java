package pkgfinal;

import java.util.Date;

public class MobileDeviceFormation {

    public String model;
    public String IMEI;
    public Date dateOfManufacture;
    public String brand;
    public String importer;
    public String deviceType;
    public String deviceCategory;

    public MobileDeviceFormation() {

    }

    public MobileDeviceFormation(String model, String IMEI, Date dateOfManufacture, String brand, String importer, String deviceType, String deviceCategory) {
        setModel(model);
        setIMEI(IMEI);
        setDateOfManufacture(dateOfManufacture);
        setBrand(brand);
        setImporter(importer);
        setDeviceType(deviceType);
        setDeviceCategory(deviceCategory);
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getIMEI() {
        return IMEI;
    }

    public void setIMEI(String IMEI) {
        try {
            if (IMEI.length() == 15) {
                this.IMEI = IMEI;
            } else {
                throw new InvalidIMEIException("IMEI number must have 15 digits");
            }
        } catch (InvalidIMEIException e) {
            System.out.println(e.getMessage());
        }
    }

    public Date getDateOfManufacture() {
        return dateOfManufacture;
    }

    public void setDateOfManufacture(Date dateOfManufacture) {
        this.dateOfManufacture = dateOfManufacture;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getImporter() {
        return importer;
    }

    public void setImporter(String importer) {
        this.importer = importer;
    }

    public String getDeviceType() {
        return deviceType;
    }

    public void setDeviceType(String deviceType) {
        try {
            if (deviceType.equalsIgnoreCase("Refurbished")) {
                this.deviceType = deviceType;
            } else if (deviceType.equalsIgnoreCase("New")) {
                this.deviceType = deviceType;
            } else {
                throw new InvalidDeviceTypeException("This device type is not accepted");
            }
        } catch (InvalidDeviceTypeException e) {
            System.out.println(e.getMessage());
        }
    }

    public String getDeviceCategory() {
        return deviceCategory;
    }

    public void setDeviceCategory(String deviceCategory) {

        try {
            if (deviceCategory.equalsIgnoreCase("Basicphones")) {
                this.deviceCategory = deviceCategory;
            } else if (deviceCategory.equalsIgnoreCase("Featurephones")) {
                this.deviceCategory = deviceCategory;
            } else if (deviceCategory.equalsIgnoreCase("Smartphones")) {
                this.deviceCategory = deviceCategory;
            } else {
                throw new InvalidDeviceCategoryException("This device category is not accepted");
            }
        } catch (InvalidDeviceCategoryException e) {
            System.out.println(e.getMessage());
        }

    }

    @Override
    public String toString() {
        return "MobileDeviceFormation -> model=" + model + " IMEI=" + IMEI + " dateOfManufacture=" + dateOfManufacture
                + " brand=" + brand + " importer=" + importer + " deviceType=" + deviceType + " deviceCategory=" + deviceCategory;
    }

}
