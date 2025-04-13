/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;

/*
 * Renamed from bSC
 */
public class bsc_0
extends bsv_0<String, Integer> {
    private final int h;
    private final String i;

    public bsc_0(int n, String string, String string2, String string3, String string4, String string5, ArrayList<bsg_2> arrayList, bss_0<?, ?> bss_02, Integer n2) {
        super(string, string2, string3, string4, arrayList, bss_02, n2);
        this.h = n;
        this.i = string5;
    }

    public int i() {
        return this.h;
    }

    public String j() {
        return this.i;
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName() + "{m_id=" + this.h + ", m_name='" + this.a() + "', m_link='" + this.b() + "', m_type='" + (String)this.e() + "', m_mode='" + this.i + "', m_iconUrl=" + this.f() + "}";
    }
}

