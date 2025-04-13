/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from fKw
 */
public class fkw_1
implements fkt_1 {
    private final Class<?> a;
    private final String b;
    private final String c;
    private final boolean d;

    public fkw_1(Class<?> clazz, String string, String string2) {
        this(clazz, string, string2, false);
    }

    public fkw_1(Class<?> clazz, String string, String string2, boolean bl) {
        this.a = clazz;
        this.b = string;
        this.c = string2;
        this.d = bl;
    }

    @Override
    public Class<?> a() {
        return this.a;
    }

    @Override
    public String a(fkx_1 fkx_12) {
        StringBuilder stringBuilder = new StringBuilder();
        if (!this.d && !fkx_12.b(this.b)) {
            fkx_12.c(this.b);
            stringBuilder.append(this.a.getSimpleName()).append(' ');
        }
        stringBuilder.append(this.b).append(" = ");
        stringBuilder.append("(").append(this.a.getSimpleName()).append(") ");
        stringBuilder.append(this.c).append(';');
        return stringBuilder.toString();
    }
}

