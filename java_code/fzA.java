/*
 * Decompiled with CFR 0.152.
 */
import java.util.List;

public class fzA
extends fzr {
    private fzz a = null;

    public void a(String string, fyy_0 fyy_02, fzz fzz2) {
        this.a = fzz2;
        this.a(string, fyy_02);
    }

    @Override
    protected void a(String[] stringArray, List<Class<?>> list, List<Object> list2) {
        list.add(fzz.class);
        list2.add(this.a);
        super.a(stringArray, list, list2);
    }

    public void a(fzA fzA2) {
        fzA2.a(this.j, this.k, this.a);
    }

    public fzA a() {
        fzA fzA2 = new fzA();
        this.a(fzA2);
        return fzA2;
    }
}

