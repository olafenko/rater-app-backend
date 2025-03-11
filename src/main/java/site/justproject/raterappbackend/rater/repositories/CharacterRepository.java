package site.justproject.raterappbackend.rater.repositories;


import org.springframework.stereotype.Repository;
import site.justproject.raterappbackend.rater.entities.CharacterEntity;

import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.concurrent.ConcurrentHashMap;

@Repository
public class CharacterRepository {


    private final Map<Integer,CharacterEntity > fakeDB = new ConcurrentHashMap<>();

    public CharacterRepository(){
        init();
    }

    public Optional<CharacterEntity> findById(int id) {

        return Optional.ofNullable(fakeDB.get(id));
    }


    public List<CharacterEntity> allSortedByRating() {

        return fakeDB.values().stream()
                .sorted((p1,p2) -> p2.getRating() - p1.getRating())
                .toList();
    }

    private void init() {
        fakeDB.put(1, new CharacterEntity(1, "Aatrox", 1000));
        fakeDB.put(2, new CharacterEntity(2, "Ahri", 1000));
        fakeDB.put(3, new CharacterEntity(3, "Akali", 1000));
        fakeDB.put(4, new CharacterEntity(4, "Akshan", 1000));
        fakeDB.put(5, new CharacterEntity(5, "Alistar", 1000));
        fakeDB.put(6, new CharacterEntity(6, "Amumu", 1000));
        fakeDB.put(7, new CharacterEntity(7, "Anivia", 1000));
        fakeDB.put(8, new CharacterEntity(8, "Annie", 1000));
        fakeDB.put(9, new CharacterEntity(9, "Aphelios", 1000));
        fakeDB.put(10, new CharacterEntity(10, "Ashe", 1000));
        fakeDB.put(11, new CharacterEntity(11, "AurelionSol", 1000));
        fakeDB.put(12, new CharacterEntity(12, "Azir", 1000));
        fakeDB.put(13, new CharacterEntity(13, "Bard", 1000));
        fakeDB.put(14, new CharacterEntity(14, "Belveth", 1000));
        fakeDB.put(15, new CharacterEntity(15, "Blitzcrank", 1000));
        fakeDB.put(16, new CharacterEntity(16, "Brand", 1000));
        fakeDB.put(17, new CharacterEntity(17, "Braum", 1000));
        fakeDB.put(18, new CharacterEntity(18, "Caitlyn", 1000));
        fakeDB.put(19, new CharacterEntity(19, "Camille", 1000));
        fakeDB.put(20, new CharacterEntity(20, "Cassiopeia", 1000));
        fakeDB.put(21, new CharacterEntity(21, "Chogath", 1000));
        fakeDB.put(22, new CharacterEntity(22, "Corki", 1000));
        fakeDB.put(23, new CharacterEntity(23, "Darius", 1000));
        fakeDB.put(24, new CharacterEntity(24, "Diana", 1000));
        fakeDB.put(25, new CharacterEntity(25, "Draven", 1000));
        fakeDB.put(26, new CharacterEntity(26, "DrMundo", 1000));
        fakeDB.put(27, new CharacterEntity(27, "Ekko", 1000));
        fakeDB.put(28, new CharacterEntity(28, "Elise", 1000));
        fakeDB.put(29, new CharacterEntity(29, "Evelynn", 1000));
        fakeDB.put(30, new CharacterEntity(30, "Ezreal", 1000));
        fakeDB.put(31, new CharacterEntity(31, "Fiddlesticks", 1000));
        fakeDB.put(32, new CharacterEntity(32, "Fiora", 1000));
        fakeDB.put(33, new CharacterEntity(33, "Fizz", 1000));
        fakeDB.put(34, new CharacterEntity(34, "Galio", 1000));
        fakeDB.put(35, new CharacterEntity(35, "Gangplank", 1000));
        fakeDB.put(36, new CharacterEntity(36, "Garen", 1000));
        fakeDB.put(37, new CharacterEntity(37, "Gnar", 1000));
        fakeDB.put(38, new CharacterEntity(38, "Gragas", 1000));
        fakeDB.put(39, new CharacterEntity(39, "Graves", 1000));
        fakeDB.put(40, new CharacterEntity(40, "Gwen", 1000));
        fakeDB.put(41, new CharacterEntity(41, "Hecarim", 1000));
        fakeDB.put(42, new CharacterEntity(42, "Heimerdinger", 1000));
        fakeDB.put(43, new CharacterEntity(43, "Illaoi", 1000));
        fakeDB.put(44, new CharacterEntity(44, "Irelia", 1000));
        fakeDB.put(45, new CharacterEntity(45, "Ivern", 1000));
        fakeDB.put(46, new CharacterEntity(46, "Janna", 1000));
        fakeDB.put(47, new CharacterEntity(47, "JarvanIV", 1000));
        fakeDB.put(48, new CharacterEntity(48, "Jax", 1000));
        fakeDB.put(49, new CharacterEntity(49, "Jayce", 1000));
        fakeDB.put(50, new CharacterEntity(50, "Jhin", 1000));
        fakeDB.put(51, new CharacterEntity(51, "Jinx", 1000));
        fakeDB.put(52, new CharacterEntity(52, "Kaisa", 1000));
        fakeDB.put(53, new CharacterEntity(53, "Kalista", 1000));
        fakeDB.put(54, new CharacterEntity(54, "Karma", 1000));
        fakeDB.put(55, new CharacterEntity(55, "Karthus", 1000));
        fakeDB.put(56, new CharacterEntity(56, "Kassadin", 1000));
        fakeDB.put(57, new CharacterEntity(57, "Katarina", 1000));
        fakeDB.put(58, new CharacterEntity(58, "Kayle", 1000));
        fakeDB.put(59, new CharacterEntity(59, "Kayn", 1000));
        fakeDB.put(60, new CharacterEntity(60, "Kennen", 1000));
        fakeDB.put(61, new CharacterEntity(61, "Khazix", 1000));
        fakeDB.put(62, new CharacterEntity(62, "Kindred", 1000));
        fakeDB.put(63, new CharacterEntity(63, "Kled", 1000));
        fakeDB.put(64, new CharacterEntity(64, "KogMaw", 1000));
        fakeDB.put(65, new CharacterEntity(65, "KSante", 1000));
        fakeDB.put(66, new CharacterEntity(66, "Leblanc", 1000));
        fakeDB.put(67, new CharacterEntity(67, "LeeSin", 1000));
        fakeDB.put(68, new CharacterEntity(68, "Leona", 1000));
        fakeDB.put(69, new CharacterEntity(69, "Lillia", 1000));
        fakeDB.put(70, new CharacterEntity(70, "Lissandra", 1000));
        fakeDB.put(71, new CharacterEntity(71, "Lucian", 1000));
        fakeDB.put(72, new CharacterEntity(72, "Lulu", 1000));
        fakeDB.put(73, new CharacterEntity(73, "Lux", 1000));
        fakeDB.put(74, new CharacterEntity(74, "Malphite", 1000));
        fakeDB.put(75, new CharacterEntity(75, "Malzahar", 1000));
        fakeDB.put(76, new CharacterEntity(76, "Maokai", 1000));
        fakeDB.put(77, new CharacterEntity(77, "MasterYi", 1000));
        fakeDB.put(78, new CharacterEntity(78, "MissFortune", 1000));
        fakeDB.put(79, new CharacterEntity(79, "MonkeyKing", 1000));
        fakeDB.put(80, new CharacterEntity(80, "Mordekaiser", 1000));
        fakeDB.put(81, new CharacterEntity(81, "Morgana", 1000));
        fakeDB.put(82, new CharacterEntity(82, "Nami", 1000));
        fakeDB.put(83, new CharacterEntity(83, "Nasus", 1000));
        fakeDB.put(84, new CharacterEntity(84, "Nautilus", 1000));
        fakeDB.put(85, new CharacterEntity(85, "Neeko", 1000));
        fakeDB.put(86, new CharacterEntity(86, "Nidalee", 1000));
        fakeDB.put(87, new CharacterEntity(87, "Nilah", 1000));
        fakeDB.put(88, new CharacterEntity(88, "Nocturne", 1000));
        fakeDB.put(89, new CharacterEntity(89, "Nunu", 1000));
        fakeDB.put(90, new CharacterEntity(90, "Olaf", 1000));
        fakeDB.put(91, new CharacterEntity(91, "Orianna", 1000));
        fakeDB.put(92, new CharacterEntity(92, "Ornn", 1000));
        fakeDB.put(93, new CharacterEntity(93, "Pantheon", 1000));
        fakeDB.put(94, new CharacterEntity(94, "Poppy", 1000));
        fakeDB.put(95, new CharacterEntity(95, "Pyke", 1000));
        fakeDB.put(96, new CharacterEntity(96, "Qiyana", 1000));
        fakeDB.put(97, new CharacterEntity(97, "Quinn", 1000));
        fakeDB.put(98, new CharacterEntity(98, "Rakan", 1000));
        fakeDB.put(99, new CharacterEntity(99, "Rammus", 1000));
        fakeDB.put(100, new CharacterEntity(100, "RekSai", 1000));
        fakeDB.put(101, new CharacterEntity(101, "Rell", 1000));
        fakeDB.put(102, new CharacterEntity(102, "Renata", 1000));
        fakeDB.put(103, new CharacterEntity(103, "Renekton", 1000));
        fakeDB.put(104, new CharacterEntity(104, "Rengar", 1000));
        fakeDB.put(105, new CharacterEntity(105, "Riven", 1000));
        fakeDB.put(106, new CharacterEntity(106, "Rumble", 1000));
        fakeDB.put(107, new CharacterEntity(107, "Ryze", 1000));
        fakeDB.put(108, new CharacterEntity(108, "Samira", 1000));
        fakeDB.put(109, new CharacterEntity(109, "Sejuani", 1000));
        fakeDB.put(110, new CharacterEntity(110, "Senna", 1000));
        fakeDB.put(111, new CharacterEntity(111, "Seraphine", 1000));
        fakeDB.put(112, new CharacterEntity(112, "Sett", 1000));
        fakeDB.put(113, new CharacterEntity(113, "Shaco", 1000));
        fakeDB.put(114, new CharacterEntity(114, "Shen", 1000));
        fakeDB.put(115, new CharacterEntity(115, "Shyvana", 1000));
        fakeDB.put(116, new CharacterEntity(116, "Singed", 1000));
        fakeDB.put(117, new CharacterEntity(117, "Sion", 1000));
        fakeDB.put(118, new CharacterEntity(118, "Sivir", 1000));
        fakeDB.put(119, new CharacterEntity(119, "Skarner", 1000));
        fakeDB.put(120, new CharacterEntity(120, "Sona", 1000));
        fakeDB.put(121, new CharacterEntity(121, "Soraka", 1000));
        fakeDB.put(122, new CharacterEntity(122, "Swain", 1000));
        fakeDB.put(123, new CharacterEntity(123, "Sylas", 1000));
        fakeDB.put(124, new CharacterEntity(124, "Syndra", 1000));
        fakeDB.put(125, new CharacterEntity(125, "TahmKench", 1000));
        fakeDB.put(126, new CharacterEntity(126, "Taliyah", 1000));
        fakeDB.put(127, new CharacterEntity(127, "Talon", 1000));
        fakeDB.put(128, new CharacterEntity(128, "Taric", 1000));
        fakeDB.put(129, new CharacterEntity(129, "Teemo", 1000));
        fakeDB.put(130, new CharacterEntity(130, "Thresh", 1000));
        fakeDB.put(131, new CharacterEntity(131, "Tristana", 1000));
        fakeDB.put(132, new CharacterEntity(132, "Trundle", 1000));
        fakeDB.put(133, new CharacterEntity(133, "Tryndamere", 1000));
        fakeDB.put(134, new CharacterEntity(134, "TwistedFate", 1000));
        fakeDB.put(135, new CharacterEntity(135, "Twitch", 1000));
        fakeDB.put(136, new CharacterEntity(136, "Udyr", 1000));
        fakeDB.put(137, new CharacterEntity(137, "Urgot", 1000));
        fakeDB.put(138, new CharacterEntity(138, "Varus", 1000));
        fakeDB.put(139, new CharacterEntity(139, "Vayne", 1000));
        fakeDB.put(140, new CharacterEntity(140, "Veigar", 1000));
        fakeDB.put(141, new CharacterEntity(141, "Velkoz", 1000));
        fakeDB.put(142, new CharacterEntity(142, "Vex", 1000));
        fakeDB.put(143, new CharacterEntity(143, "Vi", 1000));
        fakeDB.put(144, new CharacterEntity(144, "Viego", 1000));
        fakeDB.put(145, new CharacterEntity(145, "Viktor", 1000));
        fakeDB.put(146, new CharacterEntity(146, "Vladimir", 1000));
        fakeDB.put(147, new CharacterEntity(147, "Volibear", 1000));
        fakeDB.put(148, new CharacterEntity(148, "Warwick", 1000));
        fakeDB.put(149, new CharacterEntity(149, "Xayah", 1000));
        fakeDB.put(150, new CharacterEntity(150, "Xerath", 1000));
        fakeDB.put(151, new CharacterEntity(151, "XinZhao", 1000));
        fakeDB.put(152, new CharacterEntity(152, "Yasuo", 1000));
        fakeDB.put(153, new CharacterEntity(153, "Yone", 1000));
        fakeDB.put(154, new CharacterEntity(154, "Yorick", 1000));
        fakeDB.put(155, new CharacterEntity(155, "Yuumi", 1000));
        fakeDB.put(156, new CharacterEntity(156, "Zac", 1000));
        fakeDB.put(157, new CharacterEntity(157, "Zed", 1000));
        fakeDB.put(158, new CharacterEntity(158, "Zeri", 1000));
        fakeDB.put(159, new CharacterEntity(159, "Ziggs", 1000));
        fakeDB.put(160, new CharacterEntity(160, "Zilean", 1000));
        fakeDB.put(161, new CharacterEntity(161, "Zoe", 1000));
        fakeDB.put(162, new CharacterEntity(162, "Zyra", 1000));

    }
}
