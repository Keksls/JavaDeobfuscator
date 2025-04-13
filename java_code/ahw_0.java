/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import com.ankamagames.baseImpl.graphics.alea.display.DisplayedScreenElement;
import com.ankamagames.framework.graphics.engine.entity.Entity;
import com.ankamagames.framework.graphics.engine.entity.EntitySprite;
import java.util.ArrayList;
import org.apache.log4j.Logger;

/*
 * Renamed from ahW
 */
public class ahw_0
implements ahv_0 {
    private static final Logger a = Logger.getLogger(ahw_0.class);
    private final abY b;
    private final tg_0 c;
    private final afk_2 d;

    public ahw_0(tg_0 tg_02, abY abY2) {
        this.c = tg_02;
        this.b = abY2;
        this.d = ahw_0.a(this.c);
    }

    @Override
    public void a(float f2, float f3, afd_1 afd_12) {
        float f4;
        afk_2 afk_22 = ahx_0.a(this.b, f2, f3, afd_12);
        if (afk_22 == null) {
            return;
        }
        float f5 = 40.0f;
        float f6 = (float)this.d.b - 40.0f;
        float f7 = (float)this.d.c + 40.0f;
        float f8 = (float)this.d.d - 40.0f;
        float f9 = (float)this.d.e + 40.0f;
        if ((float)this.d.e() > (float)afk_22.e() + 40.0f) {
            if ((float)afk_22.b < f6) {
                afd_12.a -= (float)afk_22.b - f6;
            }
            if ((float)afk_22.c > f7) {
                afd_12.a -= (float)afk_22.c - f7;
            }
        } else {
            f4 = (float)this.d.g();
            afd_12.a = f4 - f2;
            afd_12.a = 0.0f;
        }
        if ((float)this.d.f() > (float)afk_22.f() + 40.0f) {
            if ((float)afk_22.d < f8) {
                afd_12.b -= (float)afk_22.d - f8;
            }
            if ((float)afk_22.e > f9) {
                afd_12.b -= (float)afk_22.e - f9;
            }
        } else {
            f4 = (float)this.d.h();
            afd_12.b = f4 - f3;
            afd_12.b = 0.0f;
        }
    }

    private boolean a(afk_2 afk_22) {
        return this.d.b >= afk_22.b && this.d.c <= afk_22.c && this.d.d >= afk_22.d && this.d.e <= afk_22.e;
    }

    private static afk_2 a(tg_0 tg_02) {
        afk_2 afk_22 = new afk_2(Integer.MAX_VALUE, Integer.MIN_VALUE, Integer.MAX_VALUE, Integer.MIN_VALUE);
        ArrayList<DisplayedScreenElement> arrayList = new ArrayList<DisplayedScreenElement>(16);
        short[] sArray = tg_02.a();
        int n = tg_02.z();
        int n2 = n + tg_02.B();
        int n3 = tg_02.A();
        int n4 = n3 + tg_02.C();
        int n5 = 0;
        for (int k = n3; k < n4; ++k) {
            for (int i2 = n; i2 < n2; ++i2) {
                short s2;
                if (!tg_02.c(i2, k) || (s2 = sArray[n5++]) == -1) continue;
                arrayList.clear();
                acs_0.b().a(i2, k, arrayList, acV.b);
                for (DisplayedScreenElement displayedScreenElement : arrayList) {
                    Entity entity = displayedScreenElement.e();
                    if (!(entity instanceof EntitySprite)) continue;
                    EntitySprite entitySprite = (EntitySprite)entity;
                    if (entitySprite.g() < (float)afk_22.b) {
                        afk_22.b = Hw.c(entitySprite.g());
                    }
                    if (entitySprite.h() > (float)afk_22.c) {
                        afk_22.c = Hw.d(entitySprite.h());
                    }
                    if (entitySprite.k() < (float)afk_22.d) {
                        afk_22.d = Hw.c(entitySprite.k());
                    }
                    if (!(entitySprite.j() > (float)afk_22.e)) continue;
                    afk_22.e = Hw.d(entitySprite.j());
                }
            }
        }
        return afk_22;
    }
}

