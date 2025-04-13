/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.iterator.TIntObjectIterator
 */
import gnu.trove.iterator.TIntObjectIterator;
import java.util.ArrayList;

/*
 * Renamed from bUU
 */
public class buu_0
extends bVn {
    public static final String a = "governorName";
    public static final String b = "allies";
    public static final String d = "ennemies";
    public static final String e = "isLocalAlly";
    public static final String f = "isLocalEnemy";
    public static final String g = "isWaitingForAllianceResult";
    public static final String h = "isWaitingForAllianceAnswer";
    public static final String i = "hasAlreadyAnAlly";
    public static final String j = "canInviteAnotherNation";
    public static final String[] k = new String[]{"governorName", "allies", "ennemies", "isLocalAlly", "isLocalEnemy", "isWaitingForAllianceResult", "isWaitingForAllianceAnswer", "hasAlreadyAnAlly", "canInviteAnotherNation"};
    private final ArrayList<bVn> u = new ArrayList();
    private final ArrayList<bVn> v = new ArrayList();
    private boolean w;
    private boolean x;
    private boolean y;
    private boolean z;

    public buu_0(int n) {
        super(n);
        this.h();
    }

    private void h() {
        faX faX2 = fbc_0.a.a(this.t);
        this.y = false;
        this.z = true;
        Object object = fbc_0.a.a(new Integer[]{this.t});
        while (object.hasNext()) {
            object.advance();
            int n = object.key();
            switch (faX2.F().c(n)) {
                case b: {
                    this.u.add(new bVn(n));
                    this.y = true;
                    break;
                }
                case a: {
                    this.v.add(new bVn(n));
                }
            }
        }
        object = azu_0.j().k();
        if (object == null) {
            return;
        }
        faX faX3 = ((epq_2)object).fE().m();
        fbl_0 fbl_02 = faX3.F().b(this.t);
        this.w = fbl_02 == fbl_0.b;
        fbl_0 fbl_03 = faX2.F().b(faX3.c());
        this.x = fbl_03 == fbl_0.b;
        TIntObjectIterator<faX> tIntObjectIterator = fbc_0.a.a(new Integer[]{faX3.c()});
        while (tIntObjectIterator.hasNext()) {
            tIntObjectIterator.advance();
            if (faX3.F().c(tIntObjectIterator.key()) != fbl_0.b) continue;
            this.z = false;
            break;
        }
    }

    @Override
    public String[] d() {
        return k;
    }

    @Override
    public Object b(String string) {
        if (string.equals(a)) {
            fcq_0 fcq_02 = fbc_0.a.a(this.t).D().c();
            return fcq_02 == null ? bae.h().a("nation.noGovernorDesc", new Object[0]) : fcq_02.f();
        }
        if (string.equals(b)) {
            return this.u;
        }
        if (string.equals(d)) {
            return this.v;
        }
        if (string.equals(e)) {
            return this.b() == fbl_0.b;
        }
        if (string.equals(f)) {
            return this.b() == fbl_0.a;
        }
        if (string.equals(g)) {
            return this.w;
        }
        if (string.equals(h)) {
            return this.x;
        }
        if (string.equals(i)) {
            return this.y;
        }
        if (string.equals(j)) {
            return this.z;
        }
        return super.b(string);
    }

    public boolean a() {
        return this.x;
    }

    public fbl_0 b() {
        bmr_1 bmr_12 = azu_0.j().k();
        return bmr_12 == null ? fbl_0.a : bmr_12.fE().m().F().c(this.t);
    }
}

