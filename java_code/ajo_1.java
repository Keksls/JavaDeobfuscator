/*
 * Decompiled with CFR 0.152.
 */
import java.io.UnsupportedEncodingException;
import java.util.List;
import java.util.Map;

/*
 * Renamed from aJo
 */
public class ajo_1 {
    private final Object a;

    public ajo_1(byte[] byArray) {
        this.a = byArray;
    }

    public ajo_1(Number number) {
        this.a = number;
    }

    public ajo_1(List<ajo_1> list) {
        this.a = list;
    }

    public ajo_1(Map<String, ajo_1> map) {
        this.a = map;
    }

    public String a() {
        try {
            return new String(this.b(), "UTF-8");
        }
        catch (ClassCastException classCastException) {
            throw new ajq_1(classCastException.toString());
        }
        catch (UnsupportedEncodingException unsupportedEncodingException) {
            throw new InternalError(unsupportedEncodingException.toString());
        }
    }

    public byte[] b() {
        try {
            return (byte[])this.a;
        }
        catch (ClassCastException classCastException) {
            throw new ajq_1(classCastException.toString());
        }
    }

    public Number c() {
        try {
            return (Number)this.a;
        }
        catch (ClassCastException classCastException) {
            throw new ajq_1(classCastException.toString());
        }
    }

    public int d() {
        return this.c().intValue();
    }

    public long e() {
        return this.c().longValue();
    }

    public List<ajo_1> f() {
        try {
            return (List)this.a;
        }
        catch (ClassCastException classCastException) {
            throw new ajq_1(classCastException.toString());
        }
    }

    public Map g() {
        try {
            return (Map)this.a;
        }
        catch (ClassCastException classCastException) {
            throw new ajq_1(classCastException.toString());
        }
    }

    public String toString() {
        byte[] byArray;
        Object object = this.a instanceof byte[] ? ((byArray = (byte[])this.a).length <= 12 ? new String(byArray) : "bytes:" + byArray.length) : this.a.toString();
        return "BEValue[" + (String)object + "]";
    }
}

