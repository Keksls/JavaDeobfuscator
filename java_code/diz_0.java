/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.Nullable
 *  org.keplerproject.luajava.LuaState
 */
import java.util.Random;
import org.jetbrains.annotations.Nullable;
import org.keplerproject.luajava.LuaState;

/*
 * Renamed from diZ
 */
class diz_0
extends akk_2 {
    diz_0(LuaState luaState) {
        super(luaState);
    }

    @Override
    public String a() {
        return "addEmoteShortcut";
    }

    @Override
    public akf_1[] e() {
        return dir_0.ah;
    }

    @Override
    public String b() {
        return "Ajoute l'emote sp?cifi?e dans la barre de raccourci d'item courante";
    }

    @Override
    @Nullable
    public final akf_1[] f() {
        return null;
    }

    @Override
    protected void a(int n) {
        bmr_1 bmr_12 = azu_0.j().k();
        int n2 = this.d(0);
        short s2 = -1;
        boolean bl = n > 2;
        bOv bOv2 = bmr_12.cg().k();
        if (bl && !bOv2.a(s2 = (short)((short)this.d(1)))) {
            bl = false;
        }
        if (!bl) {
            s2 = bOv2.b();
        }
        if (s2 == -1) {
            return;
        }
        if (bOv2.b(n2) == null) {
            boq_0 boq_02 = boq_0.a(fie.e, new Random().nextLong(), n2, n2);
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

