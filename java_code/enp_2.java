/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 *  org.jetbrains.annotations.NotNull
 */
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.EnumMap;
import java.util.EnumSet;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import org.apache.log4j.Logger;
import org.jetbrains.annotations.NotNull;

/*
 * Renamed from enP
 */
public class enp_2 {
    public static final enp_2 a = new enp_2();
    private static final Logger c = Logger.getLogger(enp_2.class);
    private final Map<ens_2, Object> d = new EnumMap<ens_2, Object>(ens_2.class);
    public static final EnumSet<ens_2> b = EnumSet.of(ens_2.ay, new ens_2[]{ens_2.H, ens_2.r, ens_2.I, ens_2.J, ens_2.Q});
    private byte[] e;
    private byte[] f;
    private final List<enq_2> g = new ArrayList<enq_2>();

    public static void a(String string) {
        try {
            a.b(string);
        }
        catch (IOException iOException) {
            c.error((Object)("Erreur lors du chargement du fichier de propri\u00e9t\u00e9s : " + string), (Throwable)iOException);
        }
        catch (RuntimeException runtimeException) {
            c.error((Object)("Erreur lors du chargement du fichier de propri\u00e9t\u00e9s : " + string), (Throwable)runtimeException);
        }
    }

    public void a(enq_2 enq_22) {
        this.g.add(enq_22);
    }

    public void b(String string) {
        Properties properties = new Properties();
        properties.load(new FileInputStream(string));
        this.d.clear();
        for (ens_2 ens_22 : ens_2.values()) {
            String string2 = properties.getProperty(ens_22.b());
            if (string2 == null) {
                this.d.put(ens_22, ens_22.d());
            } else {
                this.d.put(ens_22, enn_2.a(ens_22.e(), string2));
            }
            this.g.forEach(enq_22 -> enq_22.onChange(ens_22, null));
        }
        this.c();
    }

    private void c() {
        this.d();
        this.e();
    }

    private void d() {
        abx_2 abx_22 = new abx_2();
        abx_22.a(ens_2.cH);
        for (ens_2 ens_22 : ens_2.values()) {
            Object object;
            if (!ens_22.c() || (object = this.d.get((Object)ens_22)) == null) continue;
            abx_22.a(ens_22.a());
            byte[] byArray = Cz.a(enn_2.a(ens_22.b()));
            abx_22.a(byArray.length);
            abx_22.b(byArray);
        }
        this.e = abx_22.c();
    }

    private void e() {
        abx_2 abx_22 = new abx_2();
        abx_22.a(b.size());
        for (ens_2 ens_22 : b) {
            Object object = this.d.get((Object)ens_22);
            if (object == null) continue;
            abx_22.a(ens_22.a());
            byte[] byArray = Cz.a(enn_2.a(ens_22.b()));
            abx_22.a(byArray.length);
            abx_22.b(byArray);
        }
        this.f = abx_22.c();
    }

    public byte[] a() {
        if (this.e == null) {
            this.d();
        }
        return (byte[])this.e.clone();
    }

    public byte[] b() {
        if (this.f == null) {
            this.e();
        }
        return (byte[])this.f.clone();
    }

    public void a(byte[] byArray) {
        this.d.clear();
        ByteBuffer byteBuffer = ByteBuffer.wrap(byArray);
        int n = byteBuffer.getInt();
        for (int k = 0; k < n; ++k) {
            ens_2 ens_22 = ens_2.a(byteBuffer.getShort());
            byte[] byArray2 = new byte[byteBuffer.getInt()];
            byteBuffer.get(byArray2);
            String string = Cz.a(byArray2);
            Object object = this.d.put(ens_22, enn_2.a(ens_22.e(), string));
            this.g.forEach(enq_22 -> enq_22.onChange(ens_22, object));
        }
    }

    public boolean a(ens_2 ens_22) {
        return this.d.containsKey((Object)ens_22);
    }

    public int b(ens_2 ens_22) {
        Object object = this.d.get((Object)ens_22);
        if (object == null) {
            object = ens_22.d();
        }
        return ((Number)object).intValue();
    }

    public long c(ens_2 ens_22) {
        Object object = this.d.get((Object)ens_22);
        if (object == null) {
            object = ens_22.d();
        }
        return ((Number)object).longValue();
    }

    public boolean d(ens_2 ens_22) {
        Object object = this.d.get((Object)ens_22);
        if (object == null) {
            object = ens_22.d();
        }
        return (Boolean)object;
    }

    public String e(ens_2 ens_22) {
        Object object = this.d.get((Object)ens_22);
        if (object == null) {
            object = ens_22.d();
        }
        return (String)object;
    }

    public ArrayList<String> f(ens_2 ens_22) {
        Object object = this.d.get((Object)ens_22);
        if (object == null) {
            object = ens_22.d();
        }
        return (ArrayList)object;
    }

    public ww_0 g(ens_2 ens_22) {
        Object object = this.d.get((Object)ens_22);
        if (object == null) {
            object = ens_22.d();
        }
        return (ww_0)object;
    }

    public List<Long> h(ens_2 ens_22) {
        Object object = this.d.get((Object)ens_22);
        if (object == null) {
            object = ens_22.d();
        }
        return (List)object;
    }

    public float i(ens_2 ens_22) {
        Object object = this.d.get((Object)ens_22);
        if (object == null) {
            object = ens_22.d();
        }
        return ((Number)object).floatValue();
    }

    public void a(@NotNull ens_2 ens_22, String string) {
        Object object = this.d.put(ens_22, enn_2.a(ens_22.e(), string));
        this.g.forEach(enq_22 -> enq_22.onChange(ens_22, object));
        this.c();
    }

    public String toString() {
        return "SystemConfiguration{m_properties=" + this.d.size() + "}";
    }

    public String c(String string) {
        return enn_2.a(string);
    }

    public static boolean a(Ow ow) {
        List<Long> list = a.h(ens_2.I);
        if (list.isEmpty()) {
            return true;
        }
        for (Long l : list) {
            xz_0 xz_02 = xz_0.a(l.intValue());
            if (xz_02.c() != ow) continue;
            return true;
        }
        return false;
    }
}

