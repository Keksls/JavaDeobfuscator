/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 *  org.jetbrains.annotations.NotNull
 */
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;
import org.apache.log4j.Logger;
import org.jetbrains.annotations.NotNull;

public final class eBt {
    private static final Logger a = Logger.getLogger(eBt.class);
    private final List<eBu> b = new ArrayList<eBu>();
    private final short c;
    private final exq_2 d = new exq_2();
    private long e;
    private long f;
    private String g;
    private long h;
    private byte[] i;
    private boolean j;
    private int k;
    private int l;
    private int m;

    public eBt(short s2) {
        this.c = s2;
        this.p();
        this.o();
    }

    private void o() {
        exh_2[] exh_2Array = eBj.d;
        for (int k = 0; k < exh_2Array.length; ++k) {
            exh_2 exh_22 = exh_2Array[k];
            this.d.a(exh_22, false);
        }
    }

    private void p() {
        exh_2[] exh_2Array = exh_2.values();
        for (int k = 0; k < exh_2Array.length; ++k) {
            exh_2 exh_22 = exh_2Array[k];
            this.d.a(exh_22, true);
        }
    }

    public short a() {
        return this.c;
    }

    public long b() {
        return this.e;
    }

    public void a(long l) {
        this.e = l;
        this.r();
    }

    public long c() {
        return this.f;
    }

    public void b(long l) {
        long l2 = this.f;
        this.f = l;
        if (l2 != this.f) {
            this.e(l2);
        }
    }

    public short d() {
        return Oz.c.a(this.c());
    }

    public String e() {
        return this.g;
    }

    public void a(String string) {
        boolean bl = (string != null || this.g != null) && string != null && !string.equals(this.g);
        this.g = string;
        if (bl) {
            this.q();
        }
    }

    public void c(long l) {
        this.b(this.f + l);
    }

    public long f() {
        return this.h;
    }

    public void d(long l) {
        this.h = l;
    }

    public byte[] g() {
        return (byte[])this.i.clone();
    }

    public void a(byte[] byArray) {
        this.i = (byte[])byArray.clone();
    }

    @NotNull
    public exq_2 h() {
        return this.d;
    }

    public boolean i() {
        return this.j;
    }

    public void a(boolean bl) {
        this.j = bl;
        this.u();
    }

    public int j() {
        return this.k;
    }

    public void a(int n) {
        this.k = n;
        this.t();
    }

    public int k() {
        return this.l;
    }

    public void b(int n) {
        this.l = n;
        this.s();
    }

    public int l() {
        return this.m;
    }

    public void c(int n) {
        this.m = n;
    }

    public boolean m() {
        if (!this.d.m()) {
            return true;
        }
        if (this.i == null) {
            return false;
        }
        qg_1 qg_12 = new qg_1();
        try {
            qg_12.a(ByteBuffer.wrap((byte[])this.i.clone()), this.m);
        }
        catch (Exception exception) {
            a.error((Object)"Exception levee", (Throwable)exception);
        }
        return !qg_12.c.a.isEmpty();
    }

    public boolean n() {
        qg_1 qg_12 = new qg_1();
        try {
            qg_12.a(ByteBuffer.wrap((byte[])this.i.clone()), this.m);
        }
        catch (Exception exception) {
            a.error((Object)"Exception levee", (Throwable)exception);
            return false;
        }
        return true;
    }

    public void a(eBu eBu2) {
        if (!this.b.contains(eBu2)) {
            return;
        }
        this.b.remove(eBu2);
    }

    public void b(eBu eBu2) {
        if (this.b.contains(eBu2)) {
            return;
        }
        this.b.add(eBu2);
    }

    private void q() {
        ArrayList<eBu> arrayList = new ArrayList<eBu>(this.b);
        for (eBu eBu2 : arrayList) {
            eBu2.c(this);
        }
    }

    private void e(long l) {
        ArrayList<eBu> arrayList = new ArrayList<eBu>(this.b);
        for (eBu eBu2 : arrayList) {
            eBu2.a(this, l);
        }
    }

    private void r() {
        ArrayList<eBu> arrayList = new ArrayList<eBu>(this.b);
        for (eBu eBu2 : arrayList) {
            eBu2.d(this);
        }
    }

    private void s() {
        ArrayList<eBu> arrayList = new ArrayList<eBu>(this.b);
        for (eBu eBu2 : arrayList) {
            eBu2.e(this);
        }
    }

    private void t() {
        ArrayList<eBu> arrayList = new ArrayList<eBu>(this.b);
        for (eBu eBu2 : arrayList) {
            eBu2.f(this);
        }
    }

    private void u() {
        ArrayList<eBu> arrayList = new ArrayList<eBu>(this.b);
        for (eBu eBu2 : arrayList) {
            eBu2.g(this);
        }
    }

    public boolean equals(Object object) {
        if (!(object instanceof eBt)) {
            return false;
        }
        return this.e == ((eBt)object).e;
    }

    public String toString() {
        return "CompanionModel{m_id=" + this.e + ", m_breedId=" + this.c + ", m_xp=" + this.f + ", level=" + this.d() + ", m_name='" + this.g + "', m_ownerId=" + this.h + ", m_itemEquipment=" + this.d + ", m_serializedEquipment=" + (this.i != null ? this.i.length : -1) + ", m_isUnlocked=" + this.j + ", m_hpMax=" + this.k + ", m_currentHp=" + this.l + ", m_serializationVersion=" + this.m + "}";
    }
}

