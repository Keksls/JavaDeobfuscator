/*
 * Decompiled with CFR 0.152.
 */
import com.ankama.wakfu.utils.criterion.doc.Criterion;
import com.ankama.wakfu.utils.criterion.doc.Parameter;
import com.ankama.wakfu.utils.criterion.doc.Signature;
import com.ankama.wakfu.utils.criterion.doc.VarType;
import java.util.ArrayList;
import java.util.Iterator;

@Criterion(description="V\u00e9rifie si il y a une zone d'effet du type donn\u00e9 a cot\u00e9 de la cible", signatures={@Signature(description="Area type id", params={@Parameter(name="areaTypeId", type=VarType.NUMBER), @Parameter(name="target", type=VarType.STRING)}), @Signature(description="Area type name", params={@Parameter(name="areaTypeName", type=VarType.STRING), @Parameter(name="target", type=VarType.STRING)}), @Signature(description="Area type id + neighbourhood in (MOORE, VON_NEUMANN)", params={@Parameter(name="areaTypeId", type=VarType.NUMBER), @Parameter(name="target", type=VarType.STRING), @Parameter(name="neighbourhoodType", type=VarType.STRING)}), @Signature(description="Area type name + neighbourhood in (MOORE, VON_NEUMANN)", params={@Parameter(name="areaTypeName", type=VarType.STRING), @Parameter(name="target", type=VarType.STRING), @Parameter(name="neighbourhoodType", type=VarType.STRING)}), @Signature(description="Area type id + neighbourhood in (MOORE, VON_NEUMANN) + Specific id", params={@Parameter(name="areaTypeId", type=VarType.NUMBER), @Parameter(name="target", type=VarType.STRING), @Parameter(name="neighbourhoodType", type=VarType.STRING), @Parameter(name="areaSpecificIdInsteadOfTypeId", type=VarType.BOOLEAN)})})
public class evV
extends evt_0 {
    private aoq_1 f;
    private apd_2 g;
    private boolean h;

    public evV(ArrayList<aot_2> arrayList) {
        byte by = this.a(arrayList);
        if (by == 0) {
            this.f = (aoq_1)arrayList.get(0);
            this.g = null;
            this.b = evU.b;
            this.h = false;
        } else if (by == 1) {
            this.g = (apd_2)arrayList.get(0);
            this.f = null;
            this.b = evU.b;
            this.h = false;
        } else if (by == 2) {
            this.f = (aoq_1)arrayList.get(0);
            this.g = null;
            this.b(((apd_2)arrayList.get(2)).b());
            this.h = false;
        } else if (by == 3) {
            this.g = (apd_2)arrayList.get(0);
            this.f = null;
            this.b(((apd_2)arrayList.get(2)).b());
            this.h = false;
        } else if (by == 4) {
            this.g = null;
            this.f = (aoq_1)arrayList.get(0);
            this.b(((apd_2)arrayList.get(2)).b());
            this.h = true;
        }
        this.a = ((apd_2)arrayList.get(1)).b().equalsIgnoreCase("target");
    }

    private ele_0 b() {
        if (this.f != null) {
            int n = (int)this.f.a(null, null, null, null);
            return ele_0.a(n);
        }
        return ele_0.valueOf(this.g.b().toUpperCase());
    }

    @Override
    protected boolean a(epq_2 epq_22, elm_0 elm_02, aff_1 aff_12) {
        Object object;
        int n;
        int n2;
        boolean bl = false;
        if (this.h) {
            n2 = (int)this.f.a(null, null, null, null);
            n = -1;
        } else {
            n2 = -1;
            n = this.f != null ? (int)this.f.a(null, null, null, null) : ((object = ele_0.valueOf(this.g.b().toUpperCase())) != null ? ((ele_0)object).a() : -1);
        }
        object = elm_02.i().f();
        Iterator iterator = object.iterator();
        while (iterator.hasNext()) {
            sr_0 sr_02 = (sr_0)iterator.next();
            if (!this.a(n, n2, sr_02, epq_22)) continue;
            switch (this.b) {
                case a: {
                    if (!aff_12.e(sr_02.G(), sr_02.H())) break;
                    bl = true;
                    break;
                }
                case b: {
                    if (!aff_12.d(sr_02.G(), sr_02.H())) break;
                    bl = true;
                }
            }
        }
        return bl;
    }

    protected boolean a(int n, int n2, sr_0 sr_02, Su su) {
        return sr_02.w() == n || sr_02.A() == (long)n2;
    }

    @Override
    public Enum c() {
        return eyO.cr;
    }
}

