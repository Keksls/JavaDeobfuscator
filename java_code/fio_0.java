/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 *  org.jetbrains.annotations.NotNull
 */
import java.util.Iterator;
import org.apache.log4j.Logger;
import org.jetbrains.annotations.NotNull;

/*
 * Renamed from fio
 */
public abstract class fio_0<Spell extends fin_0>
implements ts_0,
efi_0,
fkw_0,
gq_1<yt_2> {
    protected static final Logger c = Logger.getLogger(fio_0.class);
    public static final short ai = 1;
    public static final short aj = 1;
    public static final short ak = 1;
    public static final int al = -1;
    protected Spell am;
    protected long an;
    protected short ao;

    protected fio_0() {
    }

    public Spell r() {
        return this.am;
    }

    public abstract fip_0<Spell> k();

    @Override
    public int G_() {
        if (this.am == null) {
            c.error((Object)("ATTENTION, on essaie de v\u00e9rifier le type de conteneur mais le spell est inconnu, uid : " + this.an), (Throwable)new Exception("for stacktrace"));
            return 11;
        }
        if (((fin_0)this.am).w()) {
            return 25;
        }
        return 11;
    }

    @Override
    public long aS_() {
        if (this.am == null) {
            c.error((Object)"On cherche a r\u00e9cup\u00e9rer l'id d'un SpellLevel mais son spell associ\u00e9 est null ", (Throwable)new Exception("Exception pour etude de stack"));
            return 0L;
        }
        return fio_0.a(((fin_0)this.am).i(), this.c());
    }

    public static long a(int n, short s2) {
        return ((long)n << 16) + (long)(s2 & 0xFF);
    }

    public static int a(long l) {
        return (int)(l >> 16);
    }

    public static short b(long l) {
        return (short)(l & 0xFFL);
    }

    @Override
    @NotNull
    public Iterator<efh_0> iterator() {
        return ((fin_0)this.am).a(this.c());
    }

    @Override
    public void release() {
    }

    protected void s() {
        this.am = null;
        this.ao = 0;
        this.an = -1L;
    }

    public void c(long l) {
        this.an = l;
    }

    @Override
    public long a() {
        return this.an;
    }

    public int n() {
        return -1;
    }

    @Override
    public int aT_() {
        return ((fin_0)this.am).i();
    }

    @Override
    public boolean a(yt_2 yt_22) {
        yt_22.a = this.an;
        yt_22.b = ((fin_0)this.am).i();
        yt_22.c = this.ao;
        return true;
    }

    public zq_2 t() {
        return zq_2.i().a(this.an).a(((fin_0)this.am).i()).b(this.ao).j();
    }

    @Override
    public boolean b(yt_2 yt_22) {
        this.an = yt_22.a;
        this.am = this.k().b(yt_22.b);
        if (this.am == null) {
            c.error((Object)("Unable to unserialize the spell " + yt_22.b + ", UID : " + this.an));
            return false;
        }
        this.c(yt_22.c);
        return true;
    }

    @Override
    public short e() {
        return 1;
    }

    @Override
    public void a(short s2) {
    }

    @Override
    public void b(short s2) {
    }

    @Override
    public boolean a(ts_0 ts_02) {
        return false;
    }

    @Override
    public short aR_() {
        return 1;
    }

    @Override
    public boolean j() {
        return true;
    }

    @Override
    public short be_() {
        return 1;
    }

    @Override
    public short z_() {
        return 1;
    }

    @Override
    public short A_() {
        return 1;
    }

    @Override
    public short c() {
        return this.ao;
    }

    public short u() {
        return (short)((fin_0)this.am).k();
    }

    public short c(short s2) {
        if (s2 > ((fin_0)this.am).k()) {
            s2 = (short)((fin_0)this.am).k();
        }
        this.ao = s2;
        return this.ao;
    }

    public efa_0 v() {
        if (this.am == null) {
            return null;
        }
        return efa_0.a(((fin_0)this.am).q());
    }

    public fiy a(epq_2 epq_22, Object object, Object object2) {
        if (this.am == null) {
            return null;
        }
        return ((fin_0)this.am).g(this, epq_22, object, object2);
    }

    public int w() {
        if (this.am != null) {
            return ((fin_0)this.am).i();
        }
        return -1;
    }

    public byte b(epq_2 epq_22, Object object, Object object2) {
        return (byte)Hw.c(((fin_0)this.am).b(this, epq_22, object, object2) + ((fin_0)this.am).c(this, epq_22, object, object2) * (float)this.c());
    }
}

