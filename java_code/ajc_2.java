/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.NotNull
 */
import java.net.InetAddress;
import java.util.Map;
import org.jetbrains.annotations.NotNull;

/*
 * Renamed from aJc
 */
public class ajc_2
implements Comparable {
    private final byte[] a;
    private final InetAddress b;
    private final int c;
    private final int d;

    public ajc_2(byte[] byArray, InetAddress inetAddress, int n) {
        this.a = byArray;
        this.b = inetAddress;
        this.c = n;
        this.d = this.d();
    }

    public ajc_2(ajn_1 ajn_12) {
        this(ajn_12.g().g());
    }

    public ajc_2(Map map) {
        ajo_1 ajo_12 = (ajo_1)map.get("peer id");
        if (ajo_12 == null) {
            throw new ajq_1("peer id missing");
        }
        this.a = ajo_12.b();
        ajo_12 = (ajo_1)map.get("ip");
        if (ajo_12 == null) {
            throw new ajq_1("ip missing");
        }
        this.b = InetAddress.getByName(ajo_12.a());
        ajo_12 = (ajo_1)map.get("port");
        if (ajo_12 == null) {
            throw new ajq_1("port missing");
        }
        this.c = ajo_12.d();
        this.d = this.d();
    }

    public byte[] a() {
        return this.a;
    }

    public InetAddress b() {
        return this.b;
    }

    public int c() {
        return this.c;
    }

    private int d() {
        int n = 0;
        for (byte by : this.a) {
            n ^= by;
        }
        return n ^ this.b.hashCode() ^ this.c;
    }

    public int hashCode() {
        return this.d;
    }

    public boolean a(ajc_2 ajc_22) {
        boolean bl = true;
        for (int k = 0; bl && k < this.a.length; ++k) {
            bl = this.a[k] == ajc_22.a[k];
        }
        return bl;
    }

    public boolean equals(Object object) {
        if (object instanceof ajc_2) {
            ajc_2 ajc_22 = (ajc_2)object;
            return this.c == ajc_22.c && this.b.equals(ajc_22.b) && this.a(ajc_22);
        }
        return false;
    }

    public int compareTo(@NotNull Object object) {
        ajc_2 ajc_22 = (ajc_2)object;
        int n = this.c - ajc_22.c;
        if (n != 0) {
            return n;
        }
        n = this.b.hashCode() - ajc_22.b.hashCode();
        if (n != 0) {
            return n;
        }
        for (byte by : this.a) {
            n = by - by;
            if (n == 0) continue;
            return n;
        }
        return 0;
    }

    public String toString() {
        return ajc_2.a(this.a) + "@" + this.b + ":" + this.c;
    }

    public static String a(byte[] byArray) {
        boolean bl = true;
        StringBuilder stringBuilder = new StringBuilder(byArray.length * 2);
        for (byte by : byArray) {
            int n = by & 0xFF;
            if (bl && n == 0) continue;
            bl = false;
            if (n < 16) {
                stringBuilder.append('0');
            }
            stringBuilder.append(Integer.toHexString(n));
        }
        return stringBuilder.toString();
    }
}

