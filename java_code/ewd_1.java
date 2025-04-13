/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.Gson
 *  com.google.gson.GsonBuilder
 *  org.apache.log4j.Level
 *  org.apache.log4j.Logger
 *  org.apache.log4j.Priority
 *  org.jetbrains.annotations.NotNull
 *  org.jetbrains.annotations.Nullable
 */
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.util.Random;
import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.apache.log4j.Priority;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from eWd
 */
public class ewd_1 {
    private static final Gson cr = new GsonBuilder().disableHtmlEscaping().create();
    private static final Random cs = new Random();
    private static final String ct = enp_2.a.b(ens_2.ay) + "-" + ot_2.a.a();
    public static final String a = "Collector";
    public static final String b = "StorageBox";
    public static final String c = "GuildStorageBox";
    public static final String d = "AddToAccountChest";
    public static final String e = "RemoveFromAccountChest";
    public static final String f = "Exchange";
    public static final String g = "KamaShield";
    public static final String h = "BuyInMerchantInventory";
    public static final String i = "KamaFightLoot";
    public static final String j = "KamaAchievementReward";
    public static final String k = "MarketAddKama";
    public static final String l = "MarketRemoveKama";
    public static final String m = "ExchangeMachineKama";
    public static final String n = "GenericActivableIEKama";
    public static final String o = "TeleporterKama";
    public static final String p = "GiveKamaAction";
    public static final String q = "KamaFromFreeCollector";
    public static final String r = "KamaToFreeCollector";
    public static final String s = "KamaFromGuildStorage";
    public static final String t = "KamaToGuildStorage";
    public static final String u = "KamaFromItemAction";
    public static final String v = "KamaToCandidateFee";
    public static final String w = "KamaFromScenario";
    public static final String x = "KamaToScenario";
    public static final String y = "KamaInLootChest";
    public static final String z = "KamaCraftFee";
    public static final String A = "Treasure";
    public static final String B = "KamaInCollector";
    public static final String C = "Resurrection";
    public static final String D = "MergeItemToSet";
    public static final String E = "FromGameActionToInventory";
    public static final String F = "FromQuestInventoryToTeleporter";
    public static final String G = "FromAccountInventoryToTeleporter";
    public static final String H = "FromInventoryToTeleporter";
    public static final String I = "FromInventoryToSteleCost";
    public static final String J = "FromCraftToInventory";
    public static final String K = "FromCraftToQuestInventory";
    public static final String L = "FromCraftToAccountInventory";
    public static final String M = "FromCraftToTemporaryInventory";
    public static final String N = "FromInventoryToCraft";
    public static final String O = "FromQuestInventoryToCraft";
    public static final String P = "FromInventoryToWebshop";
    public static final String Q = "FromInventoryToStorageBoxUnlock";
    public static final String R = "FromInventoryToCannonTravel";
    public static final String S = "FromExchangeMachineToInventory";
    public static final String T = "FromExchangeMachineToQuestInventory";
    public static final String U = "FromQuestInventoryToExchangeMachine";
    public static final String V = "FromInventoryToExchangeMachine";
    public static final String W = "FromExchangeMachineToTemporaryInventory";
    public static final String X = "FromExchangeMachineToAccountInventory";
    public static final String Y = "GiveItemActionToInventory";
    public static final String Z = "GiveItemActionToAccountInventory";
    public static final String aa = "GiveItemActionToTemporaryInventory";
    public static final String ab = "FromInventoryToRegeneration";
    public static final String ac = "AddToInventoryFromDungeonReward";
    public static final String ad = "AddToTemporaryInventoryFromDungeonReward";
    public static final String ae = "AddToQuestFromDungeonReward";
    public static final String af = "AddToAccountFromDungeonReward";
    public static final String ag = "AddToInventoryFromRandomList";
    public static final String ah = "AddToQuestInventoryFromRandomList";
    public static final String ai = "AddToAccountInventoryFromRandomList";
    public static final String aj = "AddToTemporaryInventoryFromRandomList";
    public static final String ak = "AddToInventoryFromDeploiedIE";
    public static final String al = "RemoveFromInventoryToDeployIE";
    public static final String am = "AddToTemporaryInventory";
    public static final String an = "FromLootChestToInventory";
    public static final String ao = "FromLootChestToQuestInventory";
    public static final String ap = "FromLootChestToAccountInventory";
    public static final String aq = "FromLootChestToTemporaryInventory";
    public static final String ar = "FromQuestInventoryToLootChest";
    public static final String as = "FromInventoryToLootChest";
    public static final String at = "FromInventoryToStreetLight";
    public static final String au = "FromInventoryToResourcesCollector";
    public static final String av = "FromSplitSetToInventory";
    public static final String aw = "FromQuestInventoryToScriptAction";
    public static final String ax = "FromAccountInventoryToScriptAction";
    public static final String ay = "FromInventoryToScriptAction";
    public static final String az = "FromScenarioActionToInventory";
    public static final String aA = "FromScenarioActionToQuestInventory";
    public static final String aB = "FromScenarioActionToAccountInventory";
    public static final String aC = "FromScenarioActionToTemporaryInventory";
    public static final String aD = "FromInventoryToGuildCreation";
    public static final String aE = "FromInventoryToPet";
    public static final String aF = "FromAchievementRewardToInventory";
    public static final String aG = "FromInventoryToCompanionEquipment";
    public static final String aH = "FromCompanionToInventory";
    public static final String aI = "FromCompanionEquipmentToInventory";
    public static final String aJ = "FromInventoryToBookcase";
    public static final String aK = "FromBookcaseToInventory";
    public static final String aL = "FromInventoryToDimensionalRoomManagement";
    public static final String aM = "FromFleaToInventory";
    public static final String aN = "KamaToMarket";
    public static final String aO = "KamaFromMarket";
    public static final String aP = "FromMarketToInventory";
    public static final String aQ = "FromMarketToTemporaryInventory";
    public static final String aR = "FromExpiredMarketToInventory";
    public static final String aS = "FromExpiredMarketToTemporaryInventory";
    public static final String aT = "FromCancelMarketToInventory";
    public static final String aU = "FromCancelMarketToTemporaryInventory";
    public static final String aV = "FromInventoryToMarket";
    public static final String aW = "KamaToMarketTax";
    public static final String aX = "KamaToMarketOffer";
    public static final String aY = "KamaFromMarketOffer";
    public static final String aZ = "KamaFromExpiredMarketOffer";
    public static final String ba = "KamaFromCancelMarketOffer";
    public static final String bb = "FromMarketOfferToInventory";
    public static final String bc = "FromMarketOfferToTemporaryInventory";
    public static final String bd = "FromInventoryToMarketOffer";
    public static final String be = "KamaToMarketTaxForOffer";
    public static final String bf = "FromTreasureToInventory";
    public static final String bg = "FromTreasureToTemporaryInventory";
    public static final String bh = "FromLootToInventory";
    public static final String bi = "FromLootToQuestInventory";
    public static final String bj = "FromLootToAccountInventory";
    public static final String bk = "FromLootToTemporaryInventory";
    public static final String bl = "FromCollectToTemporaryInventory";
    public static final String bm = "FromCollectToQuestInventory";
    public static final String bn = "FromQuestInventoryToCollect";
    public static final String bo = "FromInventoryToCollect";
    public static final String bp = "FromCollectToAccountInventory";
    public static final String bq = "FromCollectToInventory";
    public static final String br = "FromInventoryToEquipment";
    public static final String bs = "FromEquipmentToInventory";
    public static final String bt = "AddToEquipmentSheet";
    public static final String bu = "RemoveFromEquipmentSheet";
    public static final String bv = "FromInventoryToCollector";
    public static final String bw = "FromInventoryToHavenWorldBuilding";
    public static final String bx = "FromHavenWorldBuildingToInventory";
    public static final String by = "FromTemporaryInventoryToInventory";
    public static final String bz = "RemoveFromTemporaryInventory";
    public static final String bA = "FromInventoryToBagEquipment";
    public static final String bB = "FromInventoryToTemporaryInventory";
    public static final String bC = "FromBagEquipmentToInventory";
    public static final String bD = "FromBagEquipmentToTemporaryInventory";
    public static final String bE = "DeleteItemFromInventory";
    public static final String bF = "PlayerUseItem";
    public static final String bG = "FromSeedSpreaderToInventory";
    public static final String bH = "FromRepackToInventory";
    public static final String bI = "FromDisassembleToInventory";
    public static final String bJ = "FromInventoryToDisassemble";
    public static final String bK = "FromProtectorToInventory";
    public static final String bL = "RemoveFromInventory";
    public static final String bM = "RemoveFromInventoryToItemAction";
    public static final String bN = "RemoveFromInventoryToMimiSymbic";
    public static final String bO = "RemoveFromInventoryByModerator";
    public static final String bP = "FromMergeItemsToInventory";
    public static final String bQ = "FromIceGiftToInventory";
    public static final String bR = "FromInventoryToDummy";
    public static final String bS = "FromDummyToInventory";
    public static final String bT = "FromDummyToTemporaryInventory";
    public static final String bU = "FromEquipmentToScenario";
    public static final String bV = "FromQuestInventoryToScenario";
    public static final String bW = "FromAccountInventoryToScenario";
    public static final String bX = "FromInventoryToScenario";
    public static final String bY = "FromScenarioToInventory";
    public static final String bZ = "FromScenarioToTemporaryInventory";
    public static final String ca = "FromScenarioToQuestInventory";
    public static final String cb = "FromScenarioToAccountInventory";
    public static final String cc = "FromRewardsToInventory";
    public static final String cd = "FromInventoryToRewards";
    public static final String ce = "FromMerchantInventoryToInventory";
    public static final String cf = "FromInventoryToShards";
    public static final String cg = "FromShardsToInventory";
    public static final String ch = "FromInventoryToSublimation";
    public static final String ci = "DeleteSublimation";
    public static final String cj = "FromInventoryToShardRoll";
    public static final String ck = "FromChargeToShardRoll";
    public static final String cl = "FromPvpInventoryToTemporaryInventory";
    public static final String cm = "FromPvpInventoryToInventory";
    public static final String cn = "FromStealToPvpInventory";
    public static final String co = "RemoveFromPvpInventory";
    public static final String cp = "FromLootToPvpInventory";
    public static final String cq = "FromCollectToPvpInventory";
    private static final Logger cu = Logger.getLogger((String)"itemTrackerOpenSearch");

    public static void a(evn_2 evn_22, String string, long l, epq_2 epq_22, hp_2 hp_22) {
        switch (evn_22.b()) {
            case a: {
                evp_2 evp_22 = (evp_2)evn_22;
                String string2 = "AddTo" + string;
                ewd_1.a(string2, null, hp_22, ewf_1.a(evp_22.d(), evp_22.c(), (int)evp_22.e()), ewf_1.g(l));
                break;
            }
            case b: {
                evx_2 evx_22 = (evx_2)evn_22;
                ewd_1.a("RemoveFrom" + string, hp_22, null, ewf_1.a(evx_22.g(), evx_22.c(), (int)evx_22.d()), ewf_1.g(l));
                break;
            }
        }
    }

    public static long a() {
        return Math.abs(cs.nextLong());
    }

    public static void a(long l, String string, @Nullable hp_2 hp_22, @Nullable hp_2 hp_23, @NotNull hl_2 hl_22, @Nullable hn_2 hn_22) {
        hj_2 hj_22 = hj_2.a().a(l).a(string).b(ct).a(hp_22).b(hp_23).a(hl_22).a(hn_22).a();
        cu.log((Priority)Level.INFO, (Object)cr.toJson((Object)hj_22));
    }

    public static void a(String string, @Nullable hp_2 hp_22, @Nullable hp_2 hp_23, @NotNull hl_2 hl_22, @Nullable hn_2 hn_22) {
        ewd_1.a(cs.nextLong(), string, hp_22, hp_23, hl_22, hn_22);
    }

    public static void a(String string, @Nullable epq_2 epq_22, @Nullable epq_2 epq_23, @NotNull hl_2 hl_22) {
        Long l = null;
        if (epq_22 != null) {
            l = epq_22.T_();
        } else if (epq_23 != null) {
            l = epq_23.T_();
        }
        hn_2 hn_22 = null;
        if (l != null) {
            hn_22 = hn_2.a().a(l).a();
        }
        ewd_1.a(cs.nextLong(), string, ewf_1.a(epq_22), ewf_1.a(epq_23), hl_22, hn_22);
    }

    public static void a(String string, @Nullable epq_2 epq_22, @Nullable epq_2 epq_23, @NotNull exk_2 exk_22) {
        ewd_1.a(string, epq_22, epq_23, ewf_1.a(exk_22));
    }

    public static void a(int n) {
        Level level = Level.toLevel((int)n);
        if (level == null) {
            return;
        }
        cu.setLevel(level);
    }
}

