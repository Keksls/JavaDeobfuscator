/*
 * Decompiled with CFR 0.152.
 */
import com.ankama.wakfu.utils.criterion.doc.Criterion;
import com.ankama.wakfu.utils.criterion.doc.Parameter;
import com.ankama.wakfu.utils.criterion.doc.Signature;
import com.ankama.wakfu.utils.criterion.doc.VarType;
import java.util.ArrayList;
import java.util.Collection;

@Criterion(description="V\u00e9rifie si il ya une invoc a cot\u00e9 de la cible", signatures={@Signature(description="N'importe quelle invocation", params={@Parameter(name="target", type=VarType.STRING)}), @Signature(description="Invocation sp\u00e9cifique", params={@Parameter(name="target", type=VarType.STRING), @Parameter(name="summonId", type=VarType.NUMBER)}), @Signature(description="N'importe quelle invocation dans le voisinage (MOORE, VON_NEUMANN)", params={@Parameter(name="target", type=VarType.STRING), @Parameter(name="neighbourhoodType", type=VarType.STRING)}), @Signature(description="Invocation sp\u00e9cifique dans le voisinage (MOORE, VON_NEUMANN)", params={@Parameter(name="target", type=VarType.STRING), @Parameter(name="summonId", type=VarType.NUMBER), @Parameter(name="neighbourhoodType", type=VarType.STRING)})})
public final class evZ
extends evt_0 {
    private long f;

    public evZ(ArrayList<aot_2> arrayList) {
        byte by = this.a(arrayList);
        this.a = ((apd_2)arrayList.get(0)).b().equalsIgnoreCase("target");
        switch (by) {
            case 1: {
                this.f = ((aoq_1)arrayList.get(1)).a(null, null, null, null);
                this.b = evU.b;
                break;
            }
            case 2: {
                this.f = -1L;
                this.b(((apd_2)arrayList.get(1)).b());
                break;
            }
            case 3: {
                this.f = ((aoq_1)arrayList.get(1)).a(null, null, null, null);
                this.b(((apd_2)arrayList.get(2)).b());
            }
        }
    }

    @Override
    protected boolean a(epq_2 epq_22, elm_0 elm_02, aff_1 aff_12) {
        els_0 els_02 = epq_22.ck();
        if (els_02 == null) {
            return false;
        }
        Collection collection = els_02.am();
        for (epq_2 epq_23 : collection) {
            if (epq_23 == epq_22 || epq_23.cl() != epq_22 || (long)epq_23.gO() != this.f && this.f != -1L) continue;
            switch (this.b) {
                case a: {
                    if (!aff_12.e(epq_23.G(), epq_23.H())) break;
                    return true;
                }
                case b: {
                    if (!aff_12.d(epq_23.G(), epq_23.H())) break;
                    return true;
                }
            }
        }
        return false;
    }

    @Override
    public Enum c() {
        return eyO.ez;
    }
}

