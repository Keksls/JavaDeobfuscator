/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.keplerproject.luajava.LuaState
 */
import org.keplerproject.luajava.LuaState;

final class diG
extends akk_2 {
    diG(LuaState luaState) {
        super(luaState);
    }

    @Override
    public String a() {
        return "setText";
    }

    @Override
    public String b() {
        return "Specify the text of an InteractiveBubble or a WakfuBubble";
    }

    @Override
    public akf_1[] e() {
        return new akf_1[]{new akf_1("bubbleId", "Id de la bulle", akg_2.d, false), new akf_1("text", "Texte a afficher", akg_2.c, false), new akf_1("parameters", "Parametres du texte", akg_2.h, true)};
    }

    @Override
    public akf_1[] f() {
        return null;
    }

    @Override
    protected void a(int n) {
        ckt_2 ckt_22 = dip.a().e(this.d(0));
        String[] stringArray = null;
        if (this.b(n)) {
            stringArray = new String[n - 2];
            this.a(stringArray);
        }
        if (ckt_22 != null) {
            this.a(ckt_22, stringArray);
            return;
        }
        fvy fvy2 = dip.a().g(this.d(0));
        if (fvy2 != null) {
            this.a(fvy2, stringArray);
        }
    }

    private void a(fvy fvy2, String[] stringArray) {
        if (stringArray != null) {
            fvy2.setText(dit.a(this.i(1), stringArray));
        } else {
            fvy2.setText(dit.a(this.i(1), new Object[0]));
        }
    }

    private void a(ckt_2 ckt_22, String[] stringArray) {
        if (stringArray != null) {
            ckt_22.setBubbleText(dit.a(this.i(1), stringArray));
        } else {
            ckt_22.setBubbleText(dit.a(this.i(1), new Object[0]));
        }
    }

    private void a(String[] stringArray) {
        for (int k = 0; k < stringArray.length; ++k) {
            String string;
            stringArray[k] = string = this.k(k + 2);
        }
    }

    private boolean b(int n) {
        return n > 2;
    }
}

