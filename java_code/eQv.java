/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.procedure.TObjectProcedure
 */
import gnu.trove.procedure.TObjectProcedure;
import java.util.ArrayList;

class eQv
implements ern_1 {
    private final ArrayList<ero_1> a = new ArrayList();
    private final long b;
    private String c;
    private long d;
    private short e;

    eQv(long l) {
        this.b = l;
    }

    @Override
    public long a() {
        return this.b;
    }

    @Override
    public String b() {
        return this.c;
    }

    @Override
    public long c() {
        return this.d;
    }

    @Override
    public short d() {
        return this.e;
    }

    @Override
    public boolean a(TObjectProcedure<eQt> tObjectProcedure) {
        for (eQt eQt2 : eQt.values()) {
            if (!this.a(eQt2) || tObjectProcedure.execute((Object)eQt2)) continue;
            return false;
        }
        return true;
    }

    @Override
    public boolean a(eQt eQt2) {
        return this.a(eQt2, (short)-1);
    }

    @Override
    public boolean a(long l) {
        return (this.d & l) == l;
    }

    @Override
    public boolean a(eQt eQt2, short s2) {
        int n = 1 << eQt2.D;
        return (s2 == -1 || eQt2.a(this.e, s2)) && (this.d & (long)n) == (long)n;
    }

    public void a(String string) {
        this.c = string;
        this.e();
    }

    public void b(long l) {
        this.d = l;
        this.e();
    }

    @Override
    public void a(short s2) {
        this.e = s2;
        this.e();
    }

    private void e() {
        int n = this.a.size();
        for (int k = 0; k < n; ++k) {
            this.a.get(k).b(this);
        }
    }

    @Override
    public boolean a(ero_1 ero_12) {
        return !this.a.contains(ero_12) && this.a.add(ero_12);
    }

    @Override
    public boolean b(ero_1 ero_12) {
        return this.a.remove(ero_12);
    }

    public String toString() {
        return "GuildRankModel{m_id=" + this.b + ", m_name='" + this.c + "', m_authorisations=" + this.d + "}";
    }
}

