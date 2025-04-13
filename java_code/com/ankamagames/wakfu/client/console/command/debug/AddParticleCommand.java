/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
package com.ankamagames.wakfu.client.console.command.debug;

import com.ankamagames.baseImpl.graphics.isometric.particles.CellParticleSystem;
import com.ankamagames.baseImpl.graphics.isometric.particles.FreeParticleSystem;
import java.util.ArrayList;
import org.apache.log4j.Logger;

public class AddParticleCommand
implements avt_0 {
    @Override
    public void a(aZz aZz2, ArrayList<String> arrayList) {
        if (arrayList.size() == 3) {
            try {
                boolean bl = false;
                String string = arrayList.get(2);
                if (string.startsWith("@")) {
                    string = string.substring(1);
                    bl = true;
                }
                int n = Integer.valueOf(string);
                if (bl) {
                    FreeParticleSystem freeParticleSystem = aij_0.a().a(n);
                    bmr_1 bmr_12 = azu_0.j().k();
                    freeParticleSystem.a(bmr_12.bv());
                    aik_0.a().b(freeParticleSystem);
                } else {
                    CellParticleSystem cellParticleSystem = aij_0.a().b(n);
                    aff_1 aff_12 = azu_0.j().k().P_();
                    cellParticleSystem.a(aff_12.d(), (float)aff_12.e(), (float)aff_12.f());
                    aik_0.a().b(cellParticleSystem);
                }
            }
            catch (Exception exception) {
                Logger.getLogger(AddParticleCommand.class).error((Object)("Impossible d'ajouter la particule " + arrayList.get(1)), (Throwable)exception);
            }
        }
    }

    @Override
    public boolean a() {
        return false;
    }
}

