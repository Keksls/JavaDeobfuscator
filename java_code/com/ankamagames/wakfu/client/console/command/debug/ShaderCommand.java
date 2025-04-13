/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.map.hash.THashMap
 *  org.apache.log4j.Logger
 */
package com.ankamagames.wakfu.client.console.command.debug;

import gnu.trove.map.hash.THashMap;
import java.util.ArrayList;
import org.apache.log4j.Logger;

public class ShaderCommand
implements avt_0 {
    private static final Logger a = Logger.getLogger(ShaderCommand.class);
    private static final THashMap<String, adj_0> b = new THashMap();

    private static String b() {
        try {
            return azs_0.a().a("shadersPath");
        }
        catch (gm_0 gm_02) {
            a.error((Object)"", (Throwable)gm_02);
            return "";
        }
    }

    @Override
    public void a(aZz aZz2, ArrayList<String> arrayList) {
        if (arrayList.size() == 3) {
            String string = arrayList.get(2);
            adj_0 adj_02 = (adj_0)b.get((Object)string);
            if (adj_02 == null) {
                adj_02 = new adj_0(ShaderCommand.b() + string + ".cgfx", "test");
                adj_02.a(ans_0.D().c().b());
                adj_02.a(true);
                adj_02.a(new adK(4000));
                b.put((Object)string, (Object)adj_02);
                aui_1.a().a(adj_02);
            } else {
                adj_02.b(500);
                b.remove((Object)string);
            }
        }
    }

    @Override
    public boolean a() {
        return false;
    }
}

