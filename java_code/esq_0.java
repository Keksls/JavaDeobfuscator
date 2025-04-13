/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.Nullable
 */
import com.ankama.wakfu.utils.criterion.doc.Criterion;
import com.ankama.wakfu.utils.criterion.doc.Parameter;
import com.ankama.wakfu.utils.criterion.doc.Signature;
import com.ankama.wakfu.utils.criterion.doc.VarType;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from esq
 */
@Criterion(description="Return the id of the active cosmetic for a given type", signatures={@Signature(description="type", params={@Parameter(name="typeId", type=VarType.NUMBER)})})
public final class esq_0
extends esi_0 {
    private final aoq_1 a;

    public esq_0(ArrayList<aot_2> arrayList) {
        this.a(arrayList);
        this.a = (aoq_1)arrayList.get(0);
    }

    @Override
    public boolean a() {
        return true;
    }

    @Override
    public long a(@Nullable Object object, @Nullable Object object2, @Nullable Object object3, @Nullable Object object4) {
        if (!(object instanceof epq_2)) {
            return 0L;
        }
        epq_2 epq_22 = (epq_2)object;
        int n = (int)this.a.a(object, object2, object3, object4);
        ft_1 ft_12 = ft_1.b(n);
        if (ft_12 == null) {
            return 0L;
        }
        switch (ft_12) {
            case c: {
                return epq_22.en();
            }
            case d: {
                return epq_22.fg();
            }
            case e: {
                return epq_22.fh().isEmpty() ? 0L : ((Integer)epq_22.fh().toArray()[0]).longValue();
            }
            case f: {
                return epq_22.fi();
            }
            case g: {
                return epq_22.eO();
            }
        }
        Optional<emy_0> optional = ena_0.a().a(epq_22.R(), end_0.i);
        if (optional.isEmpty()) {
            return 0L;
        }
        ebo_0 ebo_02 = (ebo_0)optional.get();
        Optional<fv_2> optional2 = ebo_02.b(epq_22.a_(), ft_12);
        if (optional2.isEmpty()) {
            return 0L;
        }
        List<fk_2> list = optional2.get().b();
        return list.isEmpty() ? 0L : (long)list.get(0).c();
    }

    @Override
    public Enum c() {
        return eyO.gO;
    }
}

