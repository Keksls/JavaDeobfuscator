/*
 * Decompiled with CFR 0.152.
 */
import java.util.Collection;

/*
 * Renamed from fAh
 */
public interface fah_2
extends fab_1,
fam_2 {
    public Collection<ftj_0> getSelecteds();

    @Override
    default public ftj_0 getSelected() {
        return this.getSelecteds().stream().findFirst().orElse(null);
    }

    public Collection<Object> getSelectedValues();

    @Override
    default public Object getSelectedValue() {
        return this.getSelectedValues().stream().findFirst().orElse(null);
    }
}

