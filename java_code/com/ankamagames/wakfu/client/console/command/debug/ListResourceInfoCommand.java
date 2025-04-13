/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.map.hash.TShortObjectHashMap
 *  gnu.trove.procedure.TObjectProcedure
 */
package com.ankamagames.wakfu.client.console.command.debug;

import gnu.trove.map.hash.TShortObjectHashMap;
import gnu.trove.procedure.TObjectProcedure;
import java.util.ArrayList;

public class ListResourceInfoCommand
implements avt_0 {
    @Override
    public void a(aZz aZz2, ArrayList<String> arrayList) {
        aVo.a().b("Liste des ressources enregistr\u00e9s : ");
        TShortObjectHashMap tShortObjectHashMap = new TShortObjectHashMap();
        aff_1 aff_12 = azu_0.j().k().gg();
        int n = aff_12.d();
        int n2 = aff_12.e();
        bNT.f().a(new aZp(this, n, n2, tShortObjectHashMap));
        ArrayList arrayList2 = new ArrayList();
        tShortObjectHashMap.forEachValue((TObjectProcedure)new aZq(this, arrayList2));
        int n3 = arrayList2.size();
        for (int k = 0; k < n3; ++k) {
            aZr aZr2 = (aZr)arrayList2.get(k);
            aVo.a().b(" Liste pour le type " + aZr2.a() + " (pos : x=" + aZr2.c() + ", y=" + aZr2.d() + ")");
            int n4 = 0;
            int n5 = aZr2.e().size();
            for (int i2 = 0; i2 < n5; ++i2) {
                bNK bNK2 = aZr2.e().get(i2);
                aVo.a().b("    " + ++n4 + "- " + bNK2.aR().c());
            }
        }
    }

    public ArrayList<aZr> a(ArrayList<bNK> arrayList) {
        ArrayList<aZr> arrayList2 = new ArrayList<aZr>();
        for (int k = arrayList.size() - 1; k >= 0; --k) {
            bNK bNK2 = arrayList.get(k);
            aZr aZr2 = null;
            for (int i2 = arrayList2.size() - 1; i2 >= 0; --i2) {
                aZr aZr3 = arrayList2.get(i2);
                if (!aZr3.a(bNK2)) continue;
                aZr2 = aZr3;
                break;
            }
            if (aZr2 == null) {
                aZr2 = new aZr();
                arrayList2.add(aZr2);
            }
            aZr2.b(bNK2);
        }
        return arrayList2;
    }

    @Override
    public boolean a() {
        return false;
    }
}

