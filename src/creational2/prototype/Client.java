package creational2.prototype;

public class Client extends Object{

    public static void main(String[] args) {
        RegisterModel a4registerModel = new RegisterModel();
        a4registerModel.setBreadth(120);
        a4registerModel.setCoverType("ABC");
        a4registerModel.setLength(100);
        a4registerModel.setPrice(20);
        a4registerModel.setFact("XYZ");
        a4registerModel.setNoOfPages(240);

        RegisterModel a5RegisterModel = new RegisterModel();
        a5RegisterModel.setBreadth(120);
        a5RegisterModel.setCoverType("ABC");
        a5RegisterModel.setLength(120);
        a5RegisterModel.setPrice(30);
        a5RegisterModel.setFact("XYZ");
        a5RegisterModel.setNoOfPages(240);

        RegisterModel a3RegisterModel = new RegisterModel();
        a3RegisterModel.setBreadth(120);
        a3RegisterModel.setCoverType("ABC");
        a3RegisterModel.setLength(80);
        a3RegisterModel.setPrice(15);
        a3RegisterModel.setFact("XYZ");
        a3RegisterModel.setNoOfPages(240);

        RegisterFactory registerFactory = new RegisterFactory();
        registerFactory.addRegister(RegisterType.A4, a4registerModel);
        registerFactory.addRegister(RegisterType.A5, a5RegisterModel);
        registerFactory.addRegister(RegisterType.A3, a3RegisterModel);

        for (int i = 0; i < 100; ++i) {
            RegisterModel newRegister = registerFactory.getRegister(RegisterType.A4).clone();
            newRegister.setFact("Some Random Fact");
            newRegister.setCoverType("Another COver");

        }
    }

}


// Prototype DP is used when:
// 1. Creation of an object is more difficult that copying of the fields
// 2. When we need multiple instances of same type with only a few changes