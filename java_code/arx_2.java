/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from arx
 */
public class arx_2
implements arg_2 {
    private arh_2 a = null;
    private arf_2 b = null;
    private String c = "aaa";
    private int d = -1;

    arx_2() {
    }

    void a(int n) {
        this.d = n;
    }

    public Object clone() {
        Object object = null;
        try {
            object = super.clone();
        }
        catch (CloneNotSupportedException cloneNotSupportedException) {
            cloneNotSupportedException.printStackTrace();
        }
        return object;
    }

    public String toString() {
        return "[Text]" + this.c;
    }

    @Override
    public String f() {
        return this.c;
    }

    public void a(String string) {
        this.c = string;
    }

    @Override
    public int d() {
        return 0;
    }

    @Override
    public arh_2 e() {
        return null;
    }

    @Override
    public int c() {
        return 0;
    }

    @Override
    public String a() {
        return null;
    }

    @Override
    public int b() {
        return this.d;
    }
}

