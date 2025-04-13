/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from bOT
 */
public class bot_0
extends bpe_0 {
    private final ekk_0 W;

    public bot_0(ekk_0 ekk_02, short s2) {
        this.W = ekk_02;
        this.R = s2;
    }

    @Override
    public Object b(String string) {
        switch (string) {
            case "nameWithFormat": {
                return bae.h().a(6, (long)((short)this.W.A()), new Object[0]);
            }
            case "iconUrl": {
                return azs_0.a().a("effectAreasIconsPath", null, (short)this.W.A());
            }
            case "effectDescription": 
            case "nonCriticalEffectDescription": {
                eDt eDt2 = new eDt(this.W, this.R, 0);
                return eDt2.a();
            }
        }
        return super.b(string);
    }

    @Override
    public short a() {
        short s2 = (short)this.W.M();
        return s2 == 0 ? (short)245 : (short)s2;
    }

    @Override
    public short b() {
        return (short)this.W.A();
    }
}

