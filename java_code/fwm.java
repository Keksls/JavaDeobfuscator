/*
 * Decompiled with CFR 0.152.
 */
public class fwm
extends fwk<String, String> {
    @Override
    public boolean a(String string) {
        if (this.b == null || ((String)this.b).isEmpty()) {
            return true;
        }
        if (string == null) {
            return true;
        }
        return Cz.o(string).contains(Cz.o((String)this.b));
    }

    @Override
    public void a(boolean bl) {
    }

    @Override
    public void a() {
    }
}

