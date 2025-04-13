/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.iterator.TByteObjectIterator
 *  gnu.trove.map.hash.TByteObjectHashMap
 *  org.apache.log4j.Logger
 */
import gnu.trove.iterator.TByteObjectIterator;
import gnu.trove.map.hash.TByteObjectHashMap;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import org.apache.log4j.Logger;

public class bOv
implements ajh_1 {
    private static final Logger k = Logger.getLogger(bOv.class);
    public static final String a = "shortcuts";
    public static final String b = "name";
    public static final String d = "type";
    public static final String e = "index";
    public static final String f = "indexText";
    public static final String g = "keyList";
    public static final String h = "opened";
    public static final String i = "isEmpty";
    public static final String[] j = new String[]{"shortcuts", "name", "type", "index", "indexText", "keyList", "opened", "isEmpty"};
    private final fig<boq_0> l;
    private final TByteObjectHashMap<boq_0> m = new TByteObjectHashMap();
    private final TByteObjectHashMap<boq_0> n = new TByteObjectHashMap();
    private final TByteObjectHashMap<boq_0> o = new TByteObjectHashMap();
    private boolean p = false;
    private boolean q = false;
    private byte r;

    public bOv(fid fid2, byte by) {
        this.l = new fig<boq_0>(fid2, bOt.a(), fid2.a(), fid2.c(), false);
        this.r = by;
    }

    public fid a() {
        return this.l.p();
    }

    public boolean a(short s2) {
        if (this.l == null) {
            return false;
        }
        return this.l.d(s2);
    }

    public short a(boq_0 boq_02) {
        if (this.l == null) {
            return -1;
        }
        return this.l.d(boq_02);
    }

    public short b() {
        if (this.l == null) {
            return -1;
        }
        return this.l.a();
    }

    public boq_0 b(short s2) {
        if (this.l == null) {
            return null;
        }
        return (boq_0)this.l.e(s2);
    }

    public ArrayList<boq_0> a(int n) {
        return this.l.d(n);
    }

    public boq_0 b(int n) {
        if (this.l == null) {
            return null;
        }
        return (boq_0)this.l.c(n);
    }

    public boq_0 a(long l) {
        if (this.l == null) {
            return null;
        }
        return (boq_0)this.l.e(l);
    }

    public boolean b(boq_0 boq_02) {
        try {
            return this.l.h(boq_02);
        }
        catch (Exception exception) {
            return false;
        }
    }

    public boolean a(boq_0 boq_02, short s2) {
        if (this.l == null) {
            return false;
        }
        if (boq_02 == null) {
            return false;
        }
        if (this.l.e(boq_02.a()) != null) {
            aUh.a("error.shortcutItemAlreadyPresent", new Object[0]);
            return false;
        }
        try {
            short s3 = s2;
            if (s2 == -1) {
                for (s3 = 0; s3 < this.l.k() && !this.l.d(s3); s3 = (short)(s3 + 1)) {
                }
            } else if (!this.l.d(s2)) {
                this.a(s2, true);
            }
            if (s3 >= this.l.k()) {
                return false;
            }
            boolean bl = this.l.a(boq_02, s3);
            if (bl) {
                byte by = (byte)s3;
                boolean bl2 = true;
                if (this.n.get(by) == boq_02) {
                    bl2 = false;
                    this.n.remove(by);
                }
                if (bl2) {
                    this.m.put(by, (Object)boq_02);
                }
            }
            fis_1.a().a((ajf_1)this, a, i);
            return bl;
        }
        catch (uc_0 | uz_0 ua_02) {
            aUh.a("error.shortcutItemDropNotPossible", new Object[0]);
        }
        catch (Uy uy) {
            aUh.a("error.shortcutItemAlreadyPresent", new Object[0]);
        }
        return false;
    }

    public boolean a(short s2, boolean bl) {
        if (this.l == null) {
            return false;
        }
        if (!this.l.d(s2)) {
            boq_0 boq_02 = (boq_0)this.l.e(s2);
            byte by = (byte)s2;
            boolean bl2 = true;
            if (this.m.get(by) == boq_02) {
                this.m.remove(by);
                bl2 = false;
            }
            if (bl2) {
                if (bl) {
                    this.o.put(by, (Object)boq_02);
                    bl = false;
                } else {
                    this.n.put(by, (Object)boq_02);
                }
            }
            boolean bl3 = bl ? this.l.c(s2) : this.l.b(s2) != null;
            fis_1.a().a((ajf_1)this, a, i);
            return bl3;
        }
        return false;
    }

    public void a(int n, fie fie2, boolean bl) {
        ArrayList arrayList = this.l.d(n);
        if (arrayList != null) {
            for (int k = arrayList.size() - 1; k >= 0; --k) {
                boq_0 boq_02 = (boq_0)arrayList.get(k);
                if (boq_02 == null || boq_02.n() != fie2) continue;
                this.a(this.l.b(boq_02.a()), bl);
            }
        }
    }

    public boolean c(boq_0 boq_02) {
        if (this.l == null) {
            return false;
        }
        return ((TK)this.l).b(boq_02);
    }

    public void b(boq_0 boq_02, short s2) {
        byte by = (byte)s2;
        if (this.n.get(by) != null) {
            this.o.put(by, (Object)boq_02);
        }
        fis_1.a().a((ajf_1)this, a, i);
    }

    public boolean c() {
        return (!this.m.isEmpty() || !this.o.isEmpty() || !this.n.isEmpty()) && this.a().b();
    }

    public void e() {
        this.m.clear();
        this.n.clear();
        TByteObjectIterator tByteObjectIterator = this.o.iterator();
        while (tByteObjectIterator.hasNext()) {
            tByteObjectIterator.advance();
            ((boq_0)tByteObjectIterator.value()).release();
        }
        this.o.clear();
    }

    public TByteObjectIterator<boq_0> f() {
        return this.m.iterator();
    }

    public TByteObjectIterator<boq_0> g() {
        return this.n.iterator();
    }

    public TByteObjectIterator<boq_0> h() {
        return this.o.iterator();
    }

    public void a(bOA bOA2) {
        Iterator iterator = this.l.iterator();
        while (iterator.hasNext()) {
            bOA2.a((boq_0)iterator.next(), this);
        }
    }

    public void i() {
        this.l.c();
    }

    public void j() {
        fis_1.a().a((ajf_1)this, a, i);
    }

    public void k() {
        for (boq_0 boq_02 : this.l) {
            fis_1.a().a((ajf_1)boq_02, "usable");
        }
    }

    @Override
    public String[] d() {
        return j;
    }

    @Override
    public Object b(String string) {
        switch (string) {
            case "shortcuts": {
                return this.l.a(new boq_0[this.l.k()]);
            }
            case "name": {
                return bae.h().a("desc.shortcut.type." + this.a().ordinal(), new Object[0]);
            }
            case "type": {
                return this.a().ordinal();
            }
            case "index": {
                return this.r;
            }
            case "indexText": {
                return this.a() == fid.c ? Integer.valueOf(1) : String.valueOf(this.s());
            }
            case "keyList": {
                return this.t();
            }
            case "opened": {
                return this.p;
            }
            case "isEmpty": {
                return this.l();
            }
        }
        return null;
    }

    private int s() {
        return this.r - azu_0.j().m().f(this.r).a().e() + 1;
    }

    private ArrayList<String> t() {
        ArrayList<String> arrayList = new ArrayList<String>();
        int n = this.l.k();
        int n2 = this.s();
        for (int k = 0; k < n; ++k) {
            aZF aZF2 = (aZF)aZH.a().b("shortcut" + String.valueOf(n2 - 1) + String.valueOf(k));
            arrayList.add(aZF2.a());
        }
        return arrayList;
    }

    public boolean a(yq_1 yq_12) {
        return this.l.b(yq_12);
    }

    public void a(long l, boolean bl) {
        boq_0 boq_02 = (boq_0)this.l.e(l);
        if (boq_02 != null) {
            this.a(this.l.b(boq_02.a()), bl);
        }
    }

    public boolean l() {
        return this.l.m();
    }

    public boolean m() {
        return this.l.l();
    }

    public byte n() {
        return this.r;
    }

    public void a(byte by) {
        this.r = by;
    }

    public boolean o() {
        return this.p;
    }

    public void a(boolean bl) {
        this.p = bl;
    }

    public boolean p() {
        return this.q;
    }

    public void b(boolean bl) {
        this.q = bl;
    }

    public void c(boolean bl) {
        for (boq_0 boq_02 : this.l) {
            boq_02.a(bl);
            fis_1.a().a((ajf_1)boq_02, "usable");
        }
    }

    public void q() {
        this.l.j();
    }

    public fig<boq_0> r() {
        return this.l;
    }

    public String toString() {
        return this.getClass().getSimpleName() + "[type=" + (Serializable)(this.l == null ? "null" : this.l.p()) + "]";
    }
}

