/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.Nullable
 */
import java.math.BigInteger;
import java.sql.Date;
import java.sql.Timestamp;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import org.jetbrains.annotations.Nullable;

public class Xt
extends Xu
implements MR {
    private final HashMap<String, Object> B = new HashMap();
    private final int C;

    public Xt(int n) {
        this.C = n;
    }

    public int b() {
        return this.C;
    }

    public void a(String string, Object object) {
        this.B.put(string, object);
    }

    public byte c(String string) {
        if (this.b(string)) {
            Object object = this.B.get(string);
            return object != null ? (Byte)object : (byte)0;
        }
        throw new agd_1(string);
    }

    public boolean d(String string) {
        if (this.b(string)) {
            Object object = this.B.get(string);
            return object != null ? (Boolean)object : false;
        }
        throw new agd_1(string);
    }

    public int e(String string) {
        if (this.b(string)) {
            Object object = this.B.get(string);
            return object != null ? (Integer)object : 0;
        }
        throw new agd_1(string);
    }

    public long f(String string) {
        if (this.b(string)) {
            Object object = this.B.get(string);
            if (object != null) {
                if (object instanceof Long) {
                    return (Long)object;
                }
                if (object instanceof BigInteger) {
                    return ((BigInteger)object).longValue();
                }
            }
            return 0L;
        }
        throw new agd_1(string);
    }

    public float g(String string) {
        if (this.b(string)) {
            Object object = this.B.get(string);
            return object != null ? ((Float)object).floatValue() : 0.0f;
        }
        throw new agd_1(string);
    }

    public double h(String string) {
        if (this.b(string)) {
            Object object = this.B.get(string);
            return object != null ? (Double)object : 0.0;
        }
        throw new agd_1(string);
    }

    @Nullable
    public String i(String string) {
        if (this.b(string)) {
            Object object = this.B.get(string);
            return object != null ? (String)object : null;
        }
        throw new agd_1(string);
    }

    @Nullable
    public Timestamp j(String string) {
        if (this.b(string)) {
            Object object = this.B.get(string);
            return object != null ? (Timestamp)object : null;
        }
        throw new agd_1(string);
    }

    @Nullable
    public Date k(String string) {
        if (this.b(string)) {
            Object object = this.B.get(string);
            return object != null ? (Date)object : null;
        }
        throw new agd_1(string);
    }

    @Override
    public Object a(String string) {
        if (this.b(string)) {
            return this.B.get(string);
        }
        throw new agd_1(string);
    }

    @Override
    public boolean b(String string) {
        return this.B != null && this.B.containsKey(string);
    }

    public Set<String> c() {
        return this.B.keySet();
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder("RequestResultMessage : ");
        stringBuilder.append(this.getClass().getName()).append('\n');
        stringBuilder.append("Properties {\n");
        for (Map.Entry<String, Object> entry : this.B.entrySet()) {
            stringBuilder.append('\t').append(entry.getKey()).append(" = ").append(entry.getValue()).append('\n');
        }
        stringBuilder.append("}\n");
        return stringBuilder.toString();
    }
}

