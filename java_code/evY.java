/*
 * Decompiled with CFR 0.152.
 */
import com.ankama.wakfu.utils.criterion.doc.Criterion;
import com.ankama.wakfu.utils.criterion.doc.Parameter;
import com.ankama.wakfu.utils.criterion.doc.Signature;
import com.ankama.wakfu.utils.criterion.doc.VarType;
import java.util.ArrayList;

@Criterion(description="V\u00e9rifie si il y a une zone d'effet du type donn\u00e9 et appartenant \u00e0 la cible a cot\u00e9 de celle ci", signatures={@Signature(description="Area type id", params={@Parameter(name="areaTypeId", type=VarType.NUMBER), @Parameter(name="target", type=VarType.STRING)}), @Signature(description="Area type name", params={@Parameter(name="areaTypeName", type=VarType.STRING), @Parameter(name="target", type=VarType.STRING)}), @Signature(description="Area type id + neighbourhood in (MOORE, VON_NEUMANN)", params={@Parameter(name="areaTypeId", type=VarType.NUMBER), @Parameter(name="target", type=VarType.STRING), @Parameter(name="neighbourhoodType", type=VarType.STRING)}), @Signature(description="Area type name + neighbourhood in (MOORE, VON_NEUMANN)", params={@Parameter(name="areaTypeName", type=VarType.STRING), @Parameter(name="target", type=VarType.STRING), @Parameter(name="neighbourhoodType", type=VarType.STRING)}), @Signature(description="Area type id + neighbourhood in (MOORE, VON_NEUMANN) + Specific id", params={@Parameter(name="areaTypeId", type=VarType.NUMBER), @Parameter(name="target", type=VarType.STRING), @Parameter(name="neighbourhoodType", type=VarType.STRING), @Parameter(name="areaSpecificIdInsteadOfTypeId", type=VarType.BOOLEAN)})})
public final class evY
extends evV {
    public evY(ArrayList<aot_2> arrayList) {
        super(arrayList);
    }

    @Override
    protected boolean a(int n, int n2, sr_0 sr_02, Su su) {
        if (sr_02.w() != n && sr_02.A() != (long)n2) {
            return false;
        }
        return sr_02.v() == su;
    }

    @Override
    public Enum c() {
        return eyO.cq;
    }
}

