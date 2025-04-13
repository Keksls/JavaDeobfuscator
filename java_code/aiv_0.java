/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.List;

/*
 * Renamed from aiV
 */
public abstract class aiv_0 {
    private boolean a = false;
    private List<aiw_0> c = null;
    protected final ahh_0 b;

    public aiv_0(ahh_0 ahh_02) {
        this.b = ahh_02;
    }

    public void a(aiw_0 aiw_02) {
        if (this.c == null) {
            this.c = new ArrayList<aiw_0>();
        }
        this.c.add(aiw_02);
    }

    public void b(aiw_0 aiw_02) {
        if (this.c == null) {
            return;
        }
        this.c.remove(aiw_02);
    }

    public boolean g() {
        return this.a;
    }

    public void h() {
        this.a = true;
        if (this.c != null) {
            for (aiw_0 aiw_02 : this.c) {
                aiw_02.a(this);
            }
        }
    }

    public abstract float f();

    public abstract void a(int var1);
}

