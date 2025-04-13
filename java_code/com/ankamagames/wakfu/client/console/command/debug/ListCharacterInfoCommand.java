/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.iterator.TIntObjectIterator
 *  gnu.trove.map.hash.TIntObjectHashMap
 */
package com.ankamagames.wakfu.client.console.command.debug;

import gnu.trove.iterator.TIntObjectIterator;
import gnu.trove.map.hash.TIntObjectHashMap;
import java.util.ArrayList;

public class ListCharacterInfoCommand
implements avt_0 {
    @Override
    public void a(aZz aZz2, ArrayList<String> arrayList) {
        aVo.a().b("Liste des personnages enregistr\u00e9s : ");
        TIntObjectHashMap tIntObjectHashMap = new TIntObjectHashMap();
        bmf_2.a().a(new aZn(this, tIntObjectHashMap));
        ArrayList<aZo> arrayList2 = new ArrayList<aZo>();
        TIntObjectIterator tIntObjectIterator = tIntObjectHashMap.iterator();
        while (tIntObjectIterator.hasNext()) {
            tIntObjectIterator.advance();
            ArrayList arrayList3 = (ArrayList)tIntObjectIterator.value();
            arrayList2.addAll(this.a(arrayList3));
        }
        int n = azu_0.j().k().gg().d();
        int n2 = azu_0.j().k().gg().e();
        int n3 = arrayList2.size();
        for (int k = 0; k < n3; ++k) {
            aZo aZo2 = (aZo)arrayList2.get(k);
            int n4 = (int)afq_2.c(aZo2.c() - n, aZo2.d() - n2);
            if (n4 > 200) continue;
            aVo.a().b(" Liste pour la famille " + aZo2.a() + " (pos : x=" + aZo2.c() + ", y=" + aZo2.d() + ")");
            int n5 = 0;
            int n6 = aZo2.e().size();
            for (int i2 = 0; i2 < n6; ++i2) {
                blx_1 blx_12 = aZo2.e().get(i2);
                aVo.a().b("    " + ++n5 + "- " + blx_12.dp());
            }
        }
    }

    private ArrayList<aZo> a(ArrayList<blx_1> arrayList) {
        ArrayList<aZo> arrayList2 = new ArrayList<aZo>();
        for (int k = arrayList.size() - 1; k >= 0; --k) {
            blx_1 blx_12 = arrayList.get(k);
            aZo aZo2 = null;
            for (int i2 = arrayList2.size() - 1; i2 >= 0; --i2) {
                aZo aZo3 = arrayList2.get(i2);
                if (!aZo3.a(blx_12)) continue;
                aZo2 = aZo3;
                break;
            }
            if (aZo2 == null) {
                aZo2 = new aZo();
                arrayList2.add(aZo2);
            }
            aZo2.b(blx_12);
        }
        return arrayList2;
    }

    @Override
    public boolean a() {
        return false;
    }
}

