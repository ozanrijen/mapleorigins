/*
 This file is part of the OdinMS Maple Story Server
 Copyright (C) 2008 Patrick Huy <patrick.huy@frz.cc>
 Matthias Butz <matze@odinms.de>
 Jan Christian Meyer <vimes@odinms.de>

 This program is free software: you can redistribute it and/or modify
 it under the terms of the GNU Affero General Public License as
 published by the Free Software Foundation version 3 as published by
 the Free Software Foundation. You may not use, modify or distribute
 this program under any other version of the GNU Affero General Public
 License.

 This program is distributed in the hope that it will be useful,
 but WITHOUT ANY WARRANTY; without even the implied warranty of
 MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 GNU Affero General Public License for more details.

 You should have received a copy of the GNU Affero General Public License
 along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package net.opcodes;

public enum SendOpcode {

    LOGIN_STATUS(0),
    GUEST_ID_LOGIN(0x01),
    SERVERSTATUS(3),//CHECK_USER_LIMIT_RESULT
    GENDER_DONE(4),//SET_ACCOUNT_RESULT
    CONFIRM_EULA_RESULT(5),
    CHECK_PINCODE(6),
    UPDATE_PINCODE(7),
    
    VIEW_ALL_CHAR(8),
    SELECT_CHARACTER_BY_VAC(9),
    
    SERVERLIST(10),
    CHARLIST(11),
    SERVER_IP(12),
    CHAR_NAME_RESPONSE(13),
    ADD_NEW_CHAR_ENTRY(14),
    DELETE_CHAR_RESPONSE(15),
    CHANGE_CHANNEL(16),
    PING(17),
    KOREAN_INTERNET_CAFE_SHIT(18),//Useless ignore it.
    CHANNEL_SELECTED(20),
    RELOG_RESPONSE(22),
    CHECK_CRC_RESULT(23),
    LAST_CONNECTED_WORLD(26),
    RECOMMENDED_WORLD_MESSAGE(27),
    CHECK_SPW_RESULT(29),
    
    /*CWvsContext::OnPacket*/
    INVENTORY_OPERATION(30),
    INVENTORY_GROW(31),
    STAT_CHANGED(32),
    GIVE_BUFF(33),
    CANCEL_BUFF(34),
    FORCED_STAT_SET(35),
    FORCED_STAT_RESET(36),
    UPDATE_SKILLS(37),
    SKILL_USE_RESULT(38),
    FAME_RESPONSE(39),
    SHOW_STATUS_INFO(40),
    OPEN_FULL_CLIENT_DOWNLOAD_LINK(41),
    MEMO_RESULT(42),
    MAP_TRANSFER_RESULT(43),
    ANTI_MACRO_RESULT(44),
    CLAIM_RESULT(46),
    CLAIM_AVAILABLE_TIME(47),
    CLAIM_STATUS_CHANGED(48),
    SET_TAMING_MOB_INFO(49),
    QUEST_CLEAR(50),
    ENTRUSTED_SHOP_CHECK_RESULT(51),
    SKILL_LEARN_ITEM_RESULT(52),
    GATHER_ITEM_RESULT(53),
    SORT_ITEM_RESULT(54),
    SUE_CHARACTER_RESULT(56),
    TRADE_MONEY_LIMIT(58),
    SET_GENDER(59),
    GUILD_BBS_PACKET(60),
    CHAR_INFO(62),
    PARTY_OPERATION(63),
    BUDDYLIST(66),
    GUILD_OPERATION(68),
    ALLIANCE_OPERATION(69),
    SPAWN_PORTAL(70),
    SERVERMESSAGE(72),
    INCUBATOR_RESULT(73),
    SHOP_SCANNER_RESULT(74),
    SHOP_LINK_RESULT(75),
    
    MARRIAGE_REQUEST(76),
    MARRIAGE_RESULT(77),
    WEDDING_GIFT_RESULT(78),
    NOTIFY_MARRIED_PARTNER_MAP_TRANSFER(79),
    
    CASH_PET_FOOD_RESULT(80),
    SET_WEEK_EVENT_MESSAGE(81),
    SET_POTION_DISCOUNT_RATE(82),
    
    BRIDLE_MOB_CATCH_FAIL(83),
    IMITATED_NPC_RESULT(84),
    IMITATED_NPC_DATA(85),
    LIMITED_NPC_DISABLE_INFO(86),
    MONSTER_BOOK_SET_CARD(87),
    MONSTER_BOOK_SET_COVER(88),
    HOUR_CHANGED(89),
    MINIMAP_ON_OFF(90),
    CONSULT_AUTHKEY_UPDATE(91),
    CLASS_COMPETITION_AUTHKEY_UPDATE(92),
    WEB_BOARD_AUTHKEY_UPDATE(93),
    SESSION_VALUE(94),
    PARTY_VALUE(95),
    FIELD_SET_VARIABLE(96),
    BONUS_EXP_CHANGED(97),
    
    FAMILY_CHART_RESULT(0x5E),
    FAMILY_INFO_RESULT(0x5F),
    FAMILY_RESULT(0x60),
    FAMILY_JOIN_REQUEST(0x61),
    FAMILY_JOIN_REQUEST_RESULT(0x62),
    FAMILY_JOIN_ACCEPTED(0x63),
    FAMILY_PRIVILEGE_LIST(0x64),
    FAMILY_REP_GAIN(0x65),
    FAMILY_NOTIFY_LOGIN_OR_LOGOUT(0x66), //? is logged in. LOLWUT
    FAMILY_SET_PRIVILEGE(0x67),
    FAMILY_SUMMON_REQUEST(0x68),
    
    NOTIFY_LEVELUP(0xFFF),
    NOTIFY_MARRIAGE(0xFFF),
    NOTIFY_JOB_CHANGE(0xFFF),
    //SET_BUY_EQUIP_EXT(0x6C),//lol?
    MAPLE_TV_USE_RES(0xFFF), //It's not blank, It's a popup nibs
    AVATAR_MEGAPHONE_RESULT(0xFFF),//bot useless..
    SET_AVATAR_MEGAPHONE(0xFFF),
    CLEAR_AVATAR_MEGAPHONE(0xFFF),
    CANCEL_NAME_CHANGE_RESULT(0xFFF),
    CANCEL_TRANSFER_WORLD_RESULT(0xFFF),
    DESTROY_SHOP_RESULT(0xFFF),
    FAKE_GM_NOTICE(0xFFF),//bad asses
    SUCCESS_IN_USE_GACHAPON_BOX(0xFFF),
    NEW_YEAR_CARD_RES(0xFFF),
    RANDOM_MORPH_RES(0xFFF),
    CANCEL_NAME_CHANGE_BY_OTHER(0xFFF),
    SET_BUY_EQUIP_EXT(0xFFF),
    SCRIPT_PROGRESS_MESSAGE(0xFFF),
    SET_EXTRA_PENDANT_SLOT(0x79),
    DATA_CRC_CHECK_FAILED(0xFFF),
    MACRO_SYS_DATA_INIT(0xFFF),
    
    /*CStage::OnPacket*/
    SET_FIELD(140),
    SET_ITC(141),
    SET_CASH_SHOP(142),
    
    /*CField::OnPacket*/
    SET_BACK_EFFECT(143),
    SET_MAP_OBJECT_VISIBLE(144),//CMapLoadable::OnSetMapObjectVisible O_O
    CLEAR_BACK_EFFECT(145),
    BLOCKED_MAP(146),//TransferFieldRequestIgnored
    BLOCKED_SERVER(147),
    FORCED_MAP_EQUIP(148),//FIELD_SPECIFIC_DATA
    MULTICHAT(149),
    WHISPER(150),
    SPOUSE_CHAT(151),
    SUMMON_ITEM_INAVAILABLE(152), //You can't use it in this map
    
    FIELD_EFFECT(153),
    FIELD_OBSTACLE_ONOFF(154),
    FIELD_OBSTACLE_ONOFF_STATUS(155), //FIELD_OBSTACLE_ONOFF_LIST(0x8C),
    FIELD_OBSTACLE_ONOFF_LIST(0x8C),
    FIELD_OBSTACLE_ALL_RESET(156),
    BLOW_WEATHER(157),
    PLAY_JUKEBOX(158),

    ADMIN_RESULT(159),
    OX_QUIZ(160),//QUIZ
    GMEVENT_INSTRUCTIONS(161),//DESC
    CLOCK(162),
    
    CONTI_MOVE(0xFFF),
    CONTI_STATE(0xFFF),
    
    SET_QUEST_CLEAR(165),
    SET_QUEST_TIME(166),
    WARN_MESSAGE(167),
    SET_OBJECT_STATE(168),
    STOP_CLOCK(169),
    
    ARIANT_ARENA_SHOW_RESULT(0xFFF),
    PYRAMID_GAUGE(0xFFF),
    PYRAMID_SCORE(0xFFF),
    
    SPAWN_PLAYER(177),
    REMOVE_PLAYER_FROM_MAP(178),
    CHATTEXT(179), //0
    CHATTEXT1(180), //1
    CHALKBOARD(181),
    UPDATE_CHAR_BOX(182),
    SHOW_CONSUME_EFFECT(183),
    SHOW_SCROLL_EFFECT(184),
    
    SPAWN_PET(195),
    PET_SHOW(196),
    MOVE_PET(198),
    PET_CHAT(199),
    PET_NAMECHANGE(200),
    PET_EXCEPTION_LIST(0xAD),
    PET_COMMAND(201),
    
    SPAWN_SPECIAL_MAPOBJECT(203),
    REMOVE_SPECIAL_MAPOBJECT(204),
    
    MOVE_SUMMON(205),
    SUMMON_ATTACK(206),
    DAMAGE_SUMMON(207),
    SUMMON_SKILL(208),
    
    SPAWN_DRAGON(209),
    MOVE_DRAGON(210),
    REMOVE_DRAGON(211),
    
    MOVE_PLAYER(213),
    CLOSE_RANGE_ATTACK(214),
    RANGED_ATTACK(215),
    MAGIC_ATTACK(216),
    ENERGY_ATTACK(217),
    SKILL_EFFECT(218),
    CANCEL_SKILL_EFFECT(219),
    DAMAGE_PLAYER(220),
    FACIAL_EXPRESSION(221),
    
    SHOW_ITEM_EFFECT(222),
    SHOW_CHAIR(224),
    UPDATE_CHAR_LOOK(225),
    SHOW_FOREIGN_EFFECT(226),
    GIVE_FOREIGN_BUFF(227),
    CANCEL_FOREIGN_BUFF(228),
    UPDATE_PARTYMEMBER_HP(229),
    GUILD_NAME_CHANGED(0xCA),
    GUILD_MARK_CHANGED(0xCB),
    THROW_GRENADE(0xCC),
    CANCEL_CHAIR(233),
    SHOW_ITEM_GAIN_INCHAT(235),
    DOJO_WARP_UP(236),
    LUCKSACK_PASS(0xFFF),
    LUCKSACK_FAIL(0xFFF),
    MESO_BAG_MESSAGE(0xFFF),
    UPDATE_QUEST_INFO(244),
    PLAYER_HINT(247),
    MAKER_RESULT(0xD9),
    KOREAN_EVENT(0xFFF),
    OPEN_UI(253),
    LOCK_UI(255),
    DISABLE_UI(256),
    SPAWN_GUIDE(257),
    TALK_GUIDE(258),
    SHOW_COMBO(259),
    COOLDOWN(274),
    SPAWN_MONSTER(276),
    KILL_MONSTER(277),
    SPAWN_MONSTER_CONTROL(278),
    MOVE_MONSTER(279),
    MOVE_MONSTER_RESPONSE(280),
    APPLY_MONSTER_STATUS(282),
    CANCEL_MONSTER_STATUS(283),
    DAMAGE_MONSTER(286),
    SHOW_MAGNET(287),
    SHOW_MONSTER_HP(290),
    SHOW_DRAGGED(291),
    CATCH_MONSTER(292),
    CATCH_MONSTER_WITH_ITEM(0xFC),
    
    SPAWN_NPC(303),
    REMOVE_NPC(304),
    SPAWN_NPC_REQUEST_CONTROLLER(305),
    NPC_ACTION(306),
    SET_NPC_SCRIPTABLE(0x107),
    
    SPAWN_HIRED_MERCHANT(311),
    DESTROY_HIRED_MERCHANT(312),
    UPDATE_HIRED_MERCHANT(313),
    
    DROP_ITEM_FROM_MAPOBJECT(314),
    REMOVE_ITEM_FROM_MAP(316),
    
    CANNOT_SPAWN_KITE(0x10E),
    SPAWN_KITE(0x10F),
    
    SPAWN_MIST(320),
    REMOVE_MIST(321),
    SPAWN_DOOR(322),
    REMOVE_DOOR(323),
    REACTOR_HIT(326),
    REACTOR_SPAWN(328),
    REACTOR_DESTROY(329),
    
    SNOWBALL_STATE(0xFFF),
    HIT_SNOWBALL(0xFFF),
    SNOWBALL_MESSAGE(0xFFF),
    LEFT_KNOCK_BACK(0xFFF),
    
    COCONUT_HIT(0xFFF),
    COCONUT_SCORE(0xFFF),
    GUILD_BOSS_HEALER_MOVE(0xFFF),
    GUILD_BOSS_PULLEY_STATE_CHANGE(0xFFF),
    
    MONSTER_CARNIVAL_START(338),
    MONSTER_CARNIVAL_OBTAINED_CP(339),
    MONSTER_CARNIVAL_PARTY_CP(340),
    MONSTER_CARNIVAL_SUMMON(341),
    MONSTER_CARNIVAL_MESSAGE(342),
    MONSTER_CARNIVAL_DIED(343),
    MONSTER_CARNIVAL_LEAVE(344),
    
    ARIANT_ARENA_USER_SCORE(0xFFF),
    SHEEP_RANCH_INFO(0xFFF),
    SHEEP_RANCH_CLOTHES(0xFFF),
    ARIANT_SCORE(0xFFF),
    WITCH_TOWER_SCORE_UPDATE(0x12D),
    HORNTAIL_CAVE(0xFFF),
    ZAKUM_SHRINE(0xFFF),
    NPC_TALK(355),
    OPEN_NPC_SHOP(356),
    CONFIRM_SHOP_TRANSACTION(357),
    ADMIN_SHOP_MESSAGE(358),//lame :P
    ADMIN_SHOP(359),
    STORAGE(360),
    FREDRICK_MESSAGE(361),
    FREDRICK(362),
    RPS_GAME(363),
    MESSENGER(364),
    PLAYER_INTERACTION(365),
    
    TOURNAMENT(0xFFF),
    TOURNAMENT_MATCH_TABLE(0xFFF),
    TOURNAMENT_SET_PRIZE(0xFFF),
    TOURNAMENT_UEW(0xFFF),
    TOURNAMENT_CHARACTERS(0xFFF),//they never coded this :|
    
    WEDDING_PROGRESS(0xFFF),//byte step, int groomid, int brideid
    WEDDING_CEREMONY_END(0xFFF),
    
    PARCEL(0xFFF),
    
    CHARGE_PARAM_RESULT(374),
    QUERY_CASH_RESULT(375),
    CASHSHOP_OPERATION(376),
    CASHSHOP_PURCHASE_EXP_CHANGED(0x146),   // found thanks to Arnah (Vertisy)
    CASHSHOP_GIFT_INFO_RESULT(0x147),
    CASHSHOP_CHECK_NAME_CHANGE(0x148),
    CASHSHOP_CHECK_NAME_CHANGE_POSSIBLE_RESULT(0x149),
    CASHSHOP_REGISTER_NEW_CHARACTER_RESULT(0x14A),
    CASHSHOP_CHECK_TRANSFER_WORLD_POSSIBLE_RESULT(0x14B),
    CASHSHOP_GACHAPON_STAMP_RESULT(0x14C),
    CASHSHOP_CASH_ITEM_GACHAPON_RESULT(0x14D),
    CASHSHOP_CASH_GACHAPON_OPEN_RESULT(0x14E),
    
    KEYMAP(389),
    AUTO_HP_POT(390),
    AUTO_MP_POT(391),
    
    SEND_TV(0xFFF),
    REMOVE_TV(0xFFF),
    ENABLE_TV(0xFFF),
    MAPLELIFE_RESULT(0x15D),
    MAPLELIFE_ERROR(0x15E),
    MTS_OPERATION2(0xFFF),
    MTS_OPERATION(0xFFF),
    VICIOUS_HAMMER(0xFFF),
    VEGA_SCROLL(0x166);
    private int code = -2;

    private SendOpcode(int code) {
        this.code = code;
    }

    public int getValue() {
        return code;
    }
}
