/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from aVE
 */
public enum ave_0 {
    a("/!\\ Don't type search but these commands : si \"itemName\" search itemId, sm monsterId search monsters with this Id, smi \"name\" search monsterId, search quest \"questName\" search questId, ss \"monsterName\" search the states for the monsters with this name, sr \"recipeName\" search the recipe with this name.", "search", "&lt;si | sm | search quest | search spell | smi | ss&gt; &lt;value&gt; | sc", false, new emS[]{emS.c, emS.d}),
    b("Recreate specific item", "rci", "&lt;item string code&gt;", false, new emS[]{emS.c}),
    c("Show command list. Param commandName is facultative but permit to show only commands with this name pattern. Param -r permit to show associate rights.", "?", "(optionnal) &lt;\"commandName\"&gt; (optionnal) &lt;-rights | -r&gt;", false, new emS[]{emS.c, emS.d, emS.e, emS.g}),
    d("Become a god. godmode h to show full documentation.", "godmode", "&lt;h&gt;", false, new emS[]{emS.c}),
    e("Define a start date for specified event. It needs disconnect and reconnect.", "achievement", "startdate &lt;achievementId&gt; &lt;sec&gt; &lt;min&gt; &lt;hour&gt; &lt;day&gt; &lt;month&gt; &lt;year&gt;", false, new emS[]{emS.c, emS.d}),
    f("Force sending of TriggerServerEvent.", "scenario", "&lt;-t eventId | (listGroupActions | lga) scenarioId&gt;", false, new emS[]{emS.c, emS.d}),
    g("Removes all ban request on the player if mode is true, removes only your ban requests if the mode is false", "unbanrequest", "playerAccountId \"reason\" [mode]", false, new emS[]{emS.c, emS.b, emS.e}),
    h("Add recipe items on inventory.", "createRecipeItems | cri", "&lt;recipeId (qty)", false, new emS[]{emS.c}),
    i("spam h to show full documentation. ", "scheduleProcessAutoMessage | spam", "&lt;help&gt;", false, new emS[]{emS.c}),
    j("Finish current cooldown of all monsters' harvest. It needs to disconnect and reconnect to be visible.", "cancelCollectCooldown | ccc", "", false, new emS[]{emS.c}),
    k("Manage your furniture account data.", "furniture", "&lt;furnitureId&gt;", false, new emS[]{emS.c, emS.d, emS.e}),
    l("Add specified set on inventory. Id 110 for admin items.", "createset | cs ", "&lt;setId&gt;", false, new emS[]{emS.c}),
    m("Show game version.", "version | v", "", false, new emS[]{emS.c, emS.d, emS.e}),
    n("boosterPackNotice help to show full documentation. Permit to debug booster pack notice", "boosterPackNotice|bpn", "&lt;help&gt;", false, new emS[]{emS.c}),
    o("Regenerate with an inventory item.", "regenerateWithItem | regenWithItem | rwi", "&lt;itemId&gt;", false, new emS[]{emS.c, emS.d}),
    p("Add specified xp to the spell.", "addspellxp", "&lt;spellId&gt; &lt;qty&gt;", false, new emS[]{emS.c, emS.d}),
    q("Execute specified command", "generic", "&lt;commandId&gt;", false, new emS[]{emS.c, emS.d}),
    r("Teleport to monsterGroup.", "teleportToMonster |tpToMonster | tptm", "&lt;groupMonsterId&gt;", false, new emS[]{emS.c, emS.d, emS.e, emS.g}),
    s("Sessions management", "sessions", "&lt;help | list serverNumber | remove serverNumber ownerId&gt;", false, new emS[]{emS.c}),
    t("", "", "", true, new emS[0]),
    u("Mute specified player. \"unmute accountId\" to unmute.", "mute", "&lt;-hidden&gt; &lt;accountId&gt; &lt;time in minuts&gt;", false, new emS[]{emS.c, emS.d, emS.e}),
    v("Give item qty to player with specified pseudo.", "giveItem | gi ", "&lt;pseudo&gt; &lt;itemId&gt; &lt;qty&gt;", false, new emS[]{emS.c}),
    w("Force challenge launch. Use -1 to drop zone next challenge", "setNextChallenge | snc", "&lt;idChallenge&gt;", false, new emS[]{emS.c, emS.d}),
    x("Show list of current instance monsters. 0 to sort by breed id, and 1 to sort by count (default).", "showmonsterquota | smq", "&lt;sort&gt;", false, new emS[]{emS.c}),
    y("Manage lock of specified IE (lock | unlock | status | help)", "lock_ie | lie", "type IEid", false, new emS[]{emS.c}),
    z("Use lem. Learn specified emote on current account.", "learnEmote | lem", "&lt;emoteId&gt;", false, new emS[]{emS.c, emS.d, emS.e}),
    A("eu 1 to be untargetable by emotes. 0 to be targetable", "emoteUntargetable | eUntargetable | eu", "&lt;0 | 1&gt;", false, new emS[]{emS.c, emS.d, emS.e}),
    B("pvp h to show full documentation. Permit to manage PvP", "pvp", "&lt:help&gt;", false, new emS[]{emS.c, emS.d}),
    C("Random destroy of specified resource in current area.", "destroyResources | dr", "&lt;resourceId&gt; &lt;qty&gt;", false, new emS[]{emS.c, emS.d}),
    D("Get back all hp.", "regenerate | regen | r", "", false, new emS[]{emS.c, emS.d, emS.e, emS.g}),
    E("Show server statistics.", "", "", true, new emS[0]),
    F("Set all market entries of this account ID as outdated", "resetAccountMarketEntries | rame", "&lt;accountId&gt;", false, new emS[]{emS.c, emS.d}),
    G("guide help to show full documentation. Allows to manage guides.", "guide", "&lt;help&gt;", false, new emS[]{emS.c}),
    H("", "", "", true, new emS[]{emS.c, emS.d, emS.e}),
    I("List interactive elements in current partition", "list_ie | liie", "", false, new emS[]{emS.c}),
    J("Block invitations and aggressions", "staff", "&lt;on | off&gt;", false, new emS[]{emS.c, emS.d, emS.e}),
    K("fc h to show full doc.", "fightChallenge | fc", "&lt;help", false, new emS[]{emS.c, emS.d}),
    L("Set spell level.", "setspelllevel", "&lt;spellId&gt; &lt;lvl&gt;", false, new emS[]{emS.c, emS.d}),
    M("Give informations about haven bag", "dumpbag", "", false, new emS[]{emS.c}),
    N("Show list of people present in this instance.", "instanceusage", "[instanceId] | <instanceId> [showPlayers]", false, new emS[]{emS.c}),
    O("inv h to show full documentation.", "inventory | inv", "&lt;help&gt;", false, new emS[]{emS.c}),
    P("Distribute specified item in an area defined by %numeric", "distributeitems", "&lt;%numeric&gt; &lt;itemId&gt; &lt;qty&gt;", false, new emS[]{emS.c}),
    Q("Finish current challenge or environmental quest.", "finishChallenge", "", false, new emS[]{emS.c, emS.d}),
    R("Delete qty of specified item.", "deleteItem | di", "&lt;itemId&gt; &lt;qty&gt;", false, new emS[]{emS.c}),
    S("dungeonLadder help to show full documentation. Permit to manage the dungeon ladder. /!\\ ASK TO A DEV BEFORE /!\\", "dungeonLadder | dl", "&lt;help&gt;", false, new emS[]{emS.c}),
    T("ai h to show complete documentation. Permit to manage AI server.", "ai", "&lt;help&gt;", false, new emS[]{emS.c}),
    U("To become invisible or appear as if you're not online (but still visible).", "character | ch", "&lt;setVisibility | dnd&gt; &lt;0 | 1&gt;", false, new emS[]{emS.c, emS.d, emS.e}),
    V("Send player to moderation jail. Time is facultative, but if you give time param you need to give also time type : IG or IRL. The time is in minutes but rounded top ten.", "teleportToJail | tpToJail | ttj", "&lt;pseudo&gt; (&lt;time&gt; &lt;IG |IRL)", false, new emS[]{emS.c, emS.d, emS.e}),
    W("Destroy all the ecosystem.", "ragnarok", "&lt;password&gt;", false, new emS[]{emS.c}),
    X("Ogrest chaos management", "ogrest_chaos", "&lt;help | force instanceId enabled | unforce instanceId | list&gt;", false, new emS[]{emS.c}),
    Y("shard h to show full documentation.", "shard", "&lt;help&gt;", false, new emS[]{emS.c, emS.d}),
    Z("Set actuel position as respawn point.", "setrespawn", "", false, new emS[]{emS.c, emS.d, emS.e, emS.g}),
    aa("playersQuota help to show full documentation. Allows to see and change players quota of instance.", "playersQuota | pq", "\"help\" | \"get\" | \"set\" | \"reset\" ", false, new emS[]{emS.c}),
    ab("Execute specified action and scenario.", "runaction", "&lt;actionId&gt; &lt;scenarioId&gt;", false, new emS[]{emS.c}),
    ac("", "", "", true, new emS[]{emS.c, emS.d, emS.e}),
    ad("Enable or disable subscription limits", "freeaccess", "&lt;on | off&gt;", false, new emS[]{emS.c}),
    ae("Give xp to an item.", "additemxp", "&lt;qty&gt;", false, new emS[]{emS.c}),
    af("Local sysmsg of specified radius.", "sysmsg", "&lt;%radius&gt; &lt;\"message\"&gt;", false, new emS[]{emS.c, emS.d}),
    ag("Put off of moderation jail player with specified pseudo.", "freedom", "&lt;pseudo&gt;", false, new emS[]{emS.c, emS.d, emS.e}),
    ah("quota queue true|false : Activate the connection queue\nquota player n : Define a player limit to n", "quota", "(optionnal) &lt;queue | player&gt; (optionnal) &lt;true | false | number &lt;", false, new emS[]{emS.c}),
    ai("Use nation help to show full documentation.", "nation", "&lt;help&gt;", false, new emS[]{emS.c, emS.d}),
    aj("Teleport the moderator using the command", "teleport | tp", "(&lt;x&gt; &lt;y&gt;) | (&lt;id instance&gt;) | (&lt;id instance&gt; &lt;x&gt; &lt;y&gt;) | (&lt;Player name&gt;) | p (&lt;\"Instance name\"&gt;)", false, new emS[]{emS.c, emS.d, emS.e, emS.g}),
    ak("Manager the clients that are under watch (all their actions are logged on the server)", "watch", "list | watch &lt;account id&gt; | unwatch &lt;account id&gt;", false, new emS[]{emS.b}),
    al("If status, display deletion status for a character ID. Without status, restore a character. It must be deleted.", "restoreCharacter | rch", "[status] &lt;characterId&gt;", false, new emS[]{emS.c}),
    am("Send a system message to all players (chat only with tag '(All)').", "msgall", "&lt;\"message\"&gt;", false, new emS[]{emS.c, emS.d}),
    an("Sow qty of resource id around of character.", "plantResources | pr", "&lt;resourceId&gt; &lt;qty&gt;", false, new emS[]{emS.c, emS.d}),
    ao("Show current agressions list.", "showagrolist | showagro", "", false, new emS[]{emS.c}),
    ap("Add qty xp to the current character.", "addxp", "&lt;qty&gt;", false, new emS[]{emS.c, emS.d}),
    aq("state h to show full documentation.", "state", "&lt;help&gt;", false, new emS[]{emS.c, emS.d}),
    ar("bak h to show full documentation. Controls BAK parameters.", "bak", "&lt;help&gt;", false, new emS[]{emS.c}),
    as("sub h to show full documentation.", "subscriber | sub", "&lt;help&gt;", false, new emS[]{emS.c, emS.d}),
    at("comp h to show full documentation. Permit to manage companions.", "companion | comp", "&lt;help&gt;", false, new emS[]{emS.c}),
    au("Use bg help to show full documentation.", "battleground | bg", "&lt;help&gt;", false, new emS[]{emS.c}),
    av("Send a red message who'll bypass all channels filters to specified player.", "redMessageToPlayer| rmtp", "&lt;pseudo&gt; &lt;\"message\"&gt;", false, new emS[]{emS.c, emS.d, emS.e}),
    aw("Add item to inventory.", "createitem | ci", "&lt;itemId | itemName&gt; (qty) (disableTypeCheck : true|false);", false, new emS[]{emS.c}),
    ax("Enable (-a) or disable (-i) specified event.", "clientGameEvent | cge", "&lt;-a | -i&gt; &lt;idEvent&gt;", false, new emS[]{emS.c, emS.d}),
    ay("buildSheet help to show full documentation. Permit to manage your build sheet", "buildSheet|build|bs", "&lt;help&gt;", false, new emS[]{emS.c}),
    az("Play APD. Follow = true by default.", "playaps | paps", "&lt;characterId&gt; &lt;apsId&gt; &lt;duration&gt; (&lt;follow&gt;)", false, new emS[]{emS.c, emS.d}),
    aA("Give specified money quantity (can be negative)", "addmoney", "&lt;qty (numeric or like '10b45m')&gt;", false, new emS[]{emS.c}),
    aB("Destroy current instance and kick everybody inside. NEVER USE IT ON COMMON WORLD.", "destroyinstance", "", false, new emS[]{emS.c}),
    aC("symbiot h to show full documentation.", "symbiot", "&lt;help&gt;", false, new emS[]{emS.c, emS.g}),
    aD("Put InteractiveElement qty in current instance.", "spawnie", "&lt;templateId&gt; &lt;qty&gt;", false, new emS[]{emS.c, emS.d}),
    aE("craft --help to show full documentation. Used for manage jobs.", "craft", "&lt;--help&gt;", false, new emS[]{emS.c, emS.d}),
    aF("hb h to show full documentation.", "havenBag | hb", "&lt;-help&gt;", false, new emS[]{emS.c, emS.d}),
    aG("Ping the server once or automatically.", "ping", " | \"start\" | \"stop\"", false, new emS[]{emS.c, emS.d}),
    aH("Launch Almanach event.", "almanach", "&lt;start&gt; &lt;almanachEventId&gt;", false, new emS[]{emS.c, emS.d}),
    aI("hero h to show full documentation. Permit to manage heroes.", "hero", "&lt;help&gt;", false, new emS[]{emS.c}),
    aJ("globalSpeed h : show full documentation", "globalSpeed", "&lt;help&gt;", false, new emS[]{emS.c}),
    aK("Create a group of monsters. Multiple monsterId enabled.", "createFullGroup | cfg", "&lt;monsterId&gt;+", false, new emS[]{emS.c, emS.d}),
    aL("Use rem. Remove target emote and religion.", "removeEmote | rem", "&lt;emoteId&gt;", false, new emS[]{emS.c, emS.d}),
    aM("Ask to server if there are ghosts.", "ghostcheck | gc", "", false, new emS[]{emS.c}),
    aN("Clean the \"deleted\" tables entries for a character. @WARNING@ This will delete any backup for this character so make sure that the character is already restored or is no longer wanted.", "cleanDeletedTables | cdt", "&lt;characterId&gt;", false, new emS[]{emS.b}),
    aO("Value between -1 and 1 (not included). Set Wakfu or Stasis level.", "setWakfuGauge | swg", "&lt;value&gt;", false, new emS[]{emS.c, emS.d}),
    aP("Block all fights creation and chat messages in radius.", "mutePartitions | mutepart", " | &lt;radius&gt; | &lt;radius&gt; &lt;type&gt...;", false, new emS[]{emS.c, emS.d, emS.e}),
    aQ("Show player position. where * to show for all current gameserver", "where", "&lt;pseudo&gt;", false, new emS[]{emS.c, emS.d, emS.e}),
    aR("Modify turn time for current turn (if the 'af' option is set, this will set the turn time for the entire fight)", "turnduration", "&lt;seconds&gt; [(allFight | af)]", false, new emS[]{emS.c}),
    aS("Use pvpInventory help to show full documentation.", "pvpInventory", "&lt;help&gt;", false, new emS[]{emS.c, emS.d}),
    aT("Remove title to player.", "removePlayerTitle | rpt", "&lt;titleId&gt; &lt;characterId&gt;", false, new emS[]{emS.c}),
    aU("Ping specified account.", "bot", "ping &lt;accountId&gt;", false, new emS[]{emS.c}),
    aV("lag help to show full documentation. Allows to create and stop artificial lag on servers.", "lag", "\"start\" | \"stop\" | \"info\"", false, new emS[]{emS.b}),
    aW("aptitude help to show full documentation. Permit to manage a aptitude system.", "aptitude | apt", "&lt;help&gt;", false, new emS[]{emS.c, emS.d, emS.g}),
    aX("Teleport another player", "teleportuser | tpuser", "(&lt;name&gt;) | (&lt;name&gt; &lt;x&gt; &lt;y&gt;) | (&lt;name&gt; &lt;id instance&gt; &lt;x&gt; &lt;y&gt;)", false, new emS[]{emS.c, emS.d, emS.e, emS.g}),
    aY("", "addskillxp", "", true, new emS[]{emS.c, emS.d}),
    aZ("hw h to show full documentation.", "havenWorld | hw", "&lt;-help&gt;", false, new emS[]{emS.c, emS.d}),
    ba("dungeon help to show full documentation. Permit to manage the dungeon difficulty", "dungeon|dj", "&lt;help&gt;", false, new emS[]{emS.c}),
    bb("guild help to show full documentation. Permit to manage a guild.", "guild", "&lt;help&gt;", false, new emS[]{emS.c}),
    bc("spelldeck h : show full documentation", "spelldeck", "&lt;help&gt;", false, new emS[]{emS.c}),
    bd("Add qty monsters in specified monster group.", "addtogroup | atg", "&lt;groupId&gt; &lt;monsterId&gt; &lt;qty&gt;", false, new emS[]{emS.c, emS.d}),
    be("Destroy specified qty of monsters near from character.", "destroymonsters | dm", "&lt;monsterId&gt; &lt;qty&gt;", false, new emS[]{emS.c, emS.d}),
    bf("protector h to show full documentation.", "protector | pro", "&lt;help&gt;", false, new emS[]{emS.c}),
    bg("Use infinitewaves help to show full documentation.", "infinitewaves | iw", "&lt;help&gt;", false, new emS[]{emS.c, emS.d}),
    bh("nationChange <nationId>. Set current player's nation to <nationId>", "nationChange", "&lt;nationId&gt;", false, new emS[]{emS.c, emS.d, emS.e}),
    bi("Show loot table of specified monster.", "listLoot | ll", "&lt;monsterId&gt;", false, new emS[]{emS.c, emS.d}),
    bj("Send a ban request to support.", "banrequest", "&lt;accountId&gt; &lt;characterId&gt; &lt;reason&gt;", false, new emS[]{emS.c, emS.d, emS.e}),
    bk("Give title to player.", "setPlayerTitle | spt", "&lt;titleId&gt; &lt;\"pseudo\"&gt;", false, new emS[]{emS.c, emS.d}),
    bl("Stop all the servers. TimeFrame = 0 = stop a shutdown, timeFrame = -1 = show shutdown state.", "shutdown", "&lt;timeFrame | stop | nothing&gt;", false, new emS[]{emS.c}),
    bm("Launch a restat.", "spell", "&lt;-restat&gt;", false, new emS[]{emS.c, emS.g}),
    bn("Get UID of current instance.", "getInstanceUid | giuid", "", false, new emS[]{emS.c, emS.d}),
    bo("cg help tho show full documentation. Permit to manage monster groups.", "creategroup | cg", "&lt;help&gt;", false, new emS[]{emS.c, emS.d}),
    bp("Prints game account data of given account on all servers (default is current account).", "gameaccountdata | gad", "[account_id]", false, new emS[]{emS.b}),
    bq("Manage equiped pet", "pet", "help", false, new emS[]{emS.c}),
    br("", "", "", true, new emS[]{emS.c, emS.d, emS.e}),
    bs("sysconf h to show full documentation. Permit to manage server config.", "systemConfiguration || sysconf", "&lt;help&gt;", false, new emS[]{emS.c}),
    bt("sbf h to show full documentation. ", "setBonusFactor | sbf", "&lt;help&gt;", false, new emS[]{emS.c}),
    bu("Show own server rights.", "rights", "", false, new emS[]{emS.c}),
    bv("Up current character spells and level to specified level. You can't enter a lower level than your current.", "buff", "&lt;level&gt;", false, new emS[]{emS.c, emS.d}),
    bw("Manage mounts", "mount", "help", false, new emS[]{emS.c}),
    bx("Display current time in client and in game server", "time", "", false, new emS[]{emS.c}),
    by("Show population, size is for number or return.", "showpopulation", "&lt;size&gt:", false, new emS[]{emS.c}),
    bz("Show materials of specific recipe.", "listMaterials | lm | showRecipeItems | sri", "&lt;recipeId&gt;", false, new emS[]{emS.c}),
    bA("Lock server for non admin accounts.", "serverlock | sl", "&lt;on | off&gt;", false, new emS[]{emS.c}),
    bB("Give information about connection state of this account and his rights.", "identphase", "&lt;accountId&gt;", false, new emS[]{emS.c}),
    bC("Show account and character ID for this name. Add \"details\" before the name for more infos on the character. who * to do for all players.", "who", "[\"details\"] &lt;pseudo&gt;", false, new emS[]{emS.c, emS.d, emS.e}),
    bD("Send a system message to all players (chat + big text on screen). Do not abuse, it's a so heavy command.", "sysmsg", "&lt;\"Message\"&gt;", false, new emS[]{emS.c, emS.d}),
    bE("Set player level.", "setLevel | setLvl", "&lt;level&gt;", false, new emS[]{emS.c, emS.d}),
    bF("sitll h to show full documentation. Manage logging level of an item.", "setItemTrackerLogLevel | sitll", "&lt;help&gt;", false, new emS[]{emS.c}),
    bG("fight h to show full documentation.", "fight", "&lt;help&gt;", false, new emS[]{emS.c}),
    bH("Play animation.", "playAnimation | panim | playanim", "&lt;characterId&gt; &lt;animationId&gt;", false, new emS[]{emS.c, emS.d}),
    bI("", "", "", true, new emS[0]),
    bJ("Change rate of growth. Value must look like 'number.0'.", "setResourceSpeedFactor | srsf", "&lt;speed&gt;", false, new emS[]{emS.c, emS.d}),
    bK("Kick the haven bag of specified player. With pseudo only for connected character. With characterId only on the same game server.", "havenBagKick | hbk", "&lt;characterId | pseudo&gt;", false, new emS[]{emS.c, emS.d, emS.e}),
    bL("Send a red message to all people in a local proximity. It bypass all channels", "redMessage | rm ", "&lt;\"message\"&gt;", false, new emS[]{emS.c, emS.d, emS.e}),
    bM("reward h to show full documentation. Permit to interact with rewards server", "reward", "&lt:help&gt;", false, new emS[]{emS.c, emS.d}),
    bN("Use market help to show full documentation.", "market", "&lt;help&gt;", false, new emS[]{emS.c}),
    bO("Send a modal popup to player, with the message. Use it to ask to player to contact you so quickly, under penalty of kick.", "popupMessage | popupm | pumessage | pum", "&lt;pseudo&gt; &lt;\"message\"&gt;", false, new emS[]{emS.c, emS.d, emS.e}),
    bP("Manage banned words (message containing them will only be sent to the sender)", "bannedwords | bw", "list | add &quot;&lt;word&gt;&quot; | remove &quot;&lt;word&gt;&quot;", false, new emS[]{emS.b}),
    bQ("", "", "", true, new emS[0]),
    bR("Ban or unban the player [for specified time if 'ban' used]. Don't use time param for unban.", "ban | unban", " &lt;accountId&gt; &lt;time&gt;", false, new emS[]{emS.c, emS.d, emS.e}),
    bS("", "", "", true, new emS[0]),
    bT("Give informations about current partition usergroups.", "check", "&lt;-u&gt;", false, new emS[]{emS.c, emS.d}),
    bU("Launch a restat.", "aptitude | apt", "&lt;restat&gt;", true, new emS[]{emS.c, emS.d, emS.e, emS.g}),
    bV("Finish the scenario.", "endscenario", "&lt;scenarioId&gt;", false, new emS[]{emS.c}),
    bW("spellxp h to show full documentation.", "spellxp", "&lt;help&gt;", false, new emS[]{emS.c}),
    bX("Ressurect player.", "revive", "&lt;pseudo&gt;", false, new emS[]{emS.c, emS.d, emS.e, emS.g}),
    bY("Achievements management", "achievement", "&lt;var set | var get | complete | reset | disable | (completeObjective | co) | (resetObjective | ro) | (getObjectivesIds | goi) | state | filldb | reset all &gt; &lt;id_1 id_2 id_3 ... id_n &gt;", false, new emS[]{emS.c, emS.d}),
    bZ("Without parameter show player and zone buffs. With parameters, add or remove specified buff.", "zonebuff", "&lt;add | remove &gt; &lt;buffId&gt;", false, new emS[]{emS.c, emS.d}),
    ca("Kick the player.", "kick", "&lt;pseudo&gt;", false, new emS[]{emS.c, emS.d, emS.e}),
    cb("Kick every player.", "kickAll", "", false, new emS[]{emS.c}),
    cc("Unmute moderated partitions.", "unmutePartitions | unmutepart", "", false, new emS[]{emS.c, emS.d, emS.e});

    public final String cd;
    public final String ce;
    public final String cf;
    public final boolean cg;
    public final emS[] ch;

    private ave_0(String string2, String string3, String string4, boolean bl, emS[] emSArray) {
        this.cd = string2;
        this.ce = string3;
        this.cf = string4;
        this.cg = bl;
        this.ch = emSArray;
    }
}

