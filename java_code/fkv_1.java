/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.Collections;

/*
 * Renamed from fKv
 */
public class fkv_1
implements fkt_1 {
    private final String a;
    private final String b;
    private final Class<?> c;
    private final ArrayList<String> d = new ArrayList();

    public fkv_1(Class<?> clazz, String string, String string2, String ... stringArray) {
        this.a = string;
        this.b = string2;
        this.c = clazz;
        Collections.addAll(this.d, stringArray);
    }

    @Override
    public Class<?> a() {
        return this.c;
    }

    @Override
    public String a(fkx_1 fkx_12) {
        StringBuilder stringBuilder = new StringBuilder();
        if (this.b != null) {
            if (this.c != null) {
                stringBuilder.append("((").append(this.c.getSimpleName()).append(")");
            }
            stringBuilder.append(this.b);
            if (this.c != null) {
                stringBuilder.append(")");
            }
            stringBuilder.append(".");
        }
        stringBuilder.append(this.a).append("(");
        boolean bl = true;
        for (String string : this.d) {
            if (!bl) {
                stringBuilder.append(", ");
            } else {
                bl = false;
            }
            stringBuilder.append(string);
        }
        stringBuilder.append(");");
        return stringBuilder.toString();
    }
}

