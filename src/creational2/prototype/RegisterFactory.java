package creational2.prototype;

import java.util.HashMap;
import java.util.Map;

// Could also be called RegisterRegistry
public class RegisterFactory {
    private Map<RegisterType, RegisterModel> registers = new HashMap<>();

    public void addRegister(RegisterType type, RegisterModel register) {
        this.registers.put(type, register);
    }

    public RegisterModel getRegister(RegisterType type) {
        return this.registers.get(type);
    }

}
