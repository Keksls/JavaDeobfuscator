/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from aJG
 */
public class ajg_1
implements ajj_1 {
    private static final ajg_1 a = new ajg_1();
    private ajj_1 b;

    private ajg_1() {
    }

    public static ajg_1 a() {
        return a;
    }

    public void a(ajj_1 ajj_12) {
        this.b = ajj_12;
    }

    @Override
    public void a(ajf_1 ajf_12, String ... stringArray) {
        if (this.b != null) {
            this.b.a(ajf_12, stringArray);
        }
    }

    @Override
    public void a(String string, Object object) {
        if (this.b != null) {
            this.b.a(string, object);
        }
    }
}

