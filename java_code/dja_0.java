/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.Nullable
 *  org.keplerproject.luajava.LuaState
 */
import java.util.Objects;
import java.util.Optional;
import org.jetbrains.annotations.Nullable;
import org.keplerproject.luajava.LuaState;

/*
 * Renamed from dja
 */
class dja_0
extends akk_2 {
    dja_0(LuaState luaState) {
        super(luaState);
    }

    @Override
    public String a() {
        return "addEquipmentShortcut";
    }

    @Override
    public String b() {
        return "Ajoute un lien vers un objet ?quipe dans la barre de raccourcis active.";
    }

    @Override
    public akf_1[] e() {
        return dir_0.ag;
    }

    @Override
    @Nullable
    public final akf_1[] f() {
        return null;
    }

    @Override
    protected void a(int n) {
        Optional<exk_2> optional;
        exk_2 exk_22;
        bmr_1 bmr_12 = azu_0.j().k();
        String string = this.i(0);
        long l = this.g(1);
        short s2 = -1;
        boolean bl = n > 2;
        bOv bOv2 = bmr_12.cg().k();
        if (bl && !bOv2.a(s2 = (short)((short)this.d(2)))) {
            bl = false;
        }
        if (!bl) {
            s2 = bOv2.b();
        }
        if (s2 == -1) {
            return;
        }
        if ("pos".equalsIgnoreCase(string)) {
            exk_22 = bmr_12.cG().a(bmr_12.dC(), exh_2.a((byte)l));
            if (exk_22 == null) {
                return;
            }
        } else if ("uid".equalsIgnoreCase(string)) {
            optional = bmr_12.dC().b(l);
            if (optional.isEmpty()) {
                return;
            }
            exk_22 = optional.get();
            if (bmr_12.cG().a(exk_22.a()) == null) {
                return;
            }
        } else if ("refId".equalsIgnoreCase(string)) {
            exk_22 = bmr_12.cG().a(bmr_12.dC(), (int)l);
            if (exk_22 == null) {
                return;
            }
        } else {
            dir_0.a.warn((Object)("Type de r?f?rence (uid, ref id, position, ...) inconnu pour ajouter un equipment : " + string));
            return;
        }
        optional = Objects.requireNonNull(bmr_12.cG().a(exk_22.a()));
        if (bOv2.b(exk_22.aT_()) == null) {
            boq_0 boq_02 = boq_0.a(fie.d, -((exh_2)((Object)optional)).a() - 1, exk_22.aT_(), exk_22.I());
            dhy dhy2 = new dhy();
            dhy2.b(boq_02);
            dhy2.b(true);
            dhy2.c(bmr_12.cg().l());
            dhy2.d(s2);
            dhy2.a(false);
            dhy2.a_(19194);
            add_2.b().a(dhy2);
        }
    }
}

