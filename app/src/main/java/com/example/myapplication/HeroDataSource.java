package com.example.myapplication;

import android.widget.Button;

import java.util.ArrayList;

public class HeroDataSource {
    private static String[] heroNames = {
            "THANOS",
            "ULTRON",
            "LOKI",
            "BARON ZEMO",
            "RED SKULL",
            "VENOM",
            "MYSTERIO",
            "DOC OCTOPUS",
            "GREEN GOBLIN",
            "JIGEN"
    };


    private static String[] heroDetails = {
            "\"I know what it's like to lose. To feel so desperately that you're right." +
                    " Yet to fail, nonetheless. It's frightening. Turns the legs to jelly." +
                    " But I ask you, to what end? Dread it. Run from it. Destiny arrives all the same. " +
                    "And now it's here. Or should I say... I am\". -THANOS \n"+
            "Thanos was a galactic warlord Titan who allied himself with Loki Laufeyson and Ronan the Accuser.\n" +
                    "\n" +
                    "Thanos sought the Infinity Stones with his followers, the Black Order, testing both the Avengers and the Guardians of the Galaxy -" +
                    " eventually succeeding in his goal to wipe out half the universe in an apparent effort to save it, after destroying the Infinity Stones, Thanos was killed by a vengeful Thor Odinson.\n" +
                    "\n" +
                    "An alternate version of Thanos learnt of the original's failures and vowed to correct them before ultimately being defeated by the Avengers."
,
            "You will tear them apart. From the inside. -ULTRON \n"+
            "Ultron was a self-aware, self-teaching, artificial intelligence created and programmed by Tony Stark and Bruce Banner from the Ultron Program and the use of the Chitauri Scepter as part of a peacekeeping force intended to help out the Avengers. " +
                    "Ultron concludes that the only way to ensure peace on Earth is through mankind's immediate extinction."
            ,
            "\"I, Loki, Prince of Asgard, Odinson, the rightful King of Jotunheim, God of Mischief, do hereby pledge to you, my undying fidelity." +
                    "―Loki to Thanos \n" +
                    "Loki Laufeyson was an Asgardian prince, the God of Mischief, and usurper of the Asgardian throne. A Frost Giant born smaller than the rest of his species, he was the adopted brother, former nemesis, and friend of Thor Odinson; the adopted son of Odin Borson and Frigga; and the biological son of Laufey.\n" +
                    "\n" +
                    "After helping the Asgardians survive Ragnarök, Loki was killed by Thanos when the Mad Titan attacked the ship containing the refugees in search of the Space Stone. Unlike nearly everyone killed by Thanos, Loki remains dead in the prime timeline as he died before Thanos used the Infinity Stones to end half of all life in the universe. " +
                    "However, in an altered timeline, an alternate Loki escaped with the Space Stone in 2012 following the Battle of New York (due to the inadvertent help of Tony Stark and Scott Lang), and remains alive and active in the new timeline.",
            "\"When S.H.I.E.L.D. fell, Black Widow released HYDRA files to the public, millions of pages, much of it encrypted. Not easy to decipher, but I have experience and patience. A man can do anything if he has those.\"\n" +
                    "―Helmut Zemo n\\"+
            "Although Zemo was a member of a death squad of the Sokovian Armed Forces, he was a good-hearted individual, as he loved his family very much, however, after his entire family was indirectly killed in the battle between the Avengers and Ultron, despite the fact that Ultron was responsible for his family's death, he blamed the Avengers just as much as the former, Zemo's anger and hatred towards the Avengers," +
                    " consumed him to the point where he became vengeful, ruthless and slightly unstable."
            ,
            "\"You are deluded, Captain. You pretend to be a simple soldier, but in reality," +
                    " you are just afraid to admit that we have left humanity behind. Unlike you, I embrace it proudly. " +
                    "Without fear! \"-Red Skull n\\"+
            "Johann Schmidt, also known as the Red Skull, is a German ex-SS officer and scientist who had his own branch of the Third Reich Army under his command known as HYDRA in the 1940s. " +
                    "After unintentionally activating the Tesseract, Schmidt was transported to the planet Vormir where he was punished by becoming the Stonekeeper of the Soul Stone, " +
                    "an Infinity Stone that he had no hope of ever obtaining because it required the sacrifice of someone you loved.",
            "\"It's Brock, sir. Edward Brock, Jr. I'm here humbled and humiliated to ask you for one thing... I want you to kill Peter Parker. -Eddie Brock\"\n"+
                    "Edward \"Eddie\" Brock, Jr. was a photographer who gets hired by the Daily Bugle and tasked with delivering an incriminating photo of Spider-Man. He later bonds with the same alien symbiote that infected Peter Parker.\n"+
                    "Edward Brock, Jr. was the new photographer hired by the Daily Bugle a week before he met Spider-Man. He has a crush on the model Gwen Stacy. When Brock and Parker fight over a staff job, J. Jonah Jameson asks for a picture of Spider-Man with his \"hand in a cookie jar.\""
            ,
            "Quentin Beck was a former employee of Stark Industries who was fired for being enraged that his life's work was named B.A.R.F. by the billionaire.\n" +
                    "\n" +
                    "After Tony Stark's death, " +
                    "Beck worked with a team of other disgruntled former Stark employees and invented the Elementals and the superhero persona Mysterio to take his revenge.",
            "\"Intelligence is not a privilege, it's a gift. And you use it for the good of mankind. \"-Otto Octavius n\\"+
            "Dr. Otto Octavius was a scientist who worked for Harry Osborn at Oscorp when an accident with his project made him into the villainous Doctor Octopus.n\\"+
           "After his battle with Spider-Man, he was confronted by Peter, the student and would-be scientist who learned the responsibility of intelligence from Otto himself. Finally remembering that intelligence was a gift for the good of mankind, Otto regained control over his mechanical arms and his sanity, and sacrificed his experiment, as well as his dreams," +
                    " to save New York from the danger he created, redeeming himself before he died." ,
            "\"You've spun your last web, Spider-Man. If you had not been so selfish, your little girlfriend's death would have been quick and painless, but now that you've really pissed me off," +
                    " I'm gonna finish her nice and slow. MJ and I, we're gonna have a hell of a time!\" Norman Osborn n\\"+
            "Norman Osborn was the founder of Oscorp and later became one of Spider-Man's first supervillains, the Green Goblin."+
            "The Green Goblin was Norman Osborn's second personality, born because of the exposure to the experimental performance enhancing gas. The Green Goblin may perhaps be the unrestrained manifestation of Norman Osborn's ambition for power, desire to succeed, and hatred for anyone who may be a hindrance to his control, such as greedy contractors and board members, and his destined enemy, the superhero Spider-Man. He was a violent psychopath and an over-ambitious maniac who believed that his power gave him endless possible potential and placed him above normal people. He even attempted to invite Spider-Man to join him," +
                    " believing that as another powerful being above normal people, they both could accomplish many things together.",

            "Around the time that Kaguya Ōtsutsuki and Isshiki Ōtsutsuki arrived on Earth, Jigen was a novice monk and after Kaguya left him for dead, Isshiki assaulted Jigen, during which he shrunk himself and entered the monk's ear in order to survive. Through having his nutrients absorbed from within his body, Isshiki began gaining control over Jigen’s body, and eventually lost full control of it. Afterwards, Isshiki embedded his Kāma in Jigen, but because his body wasn't powerful enough to sustain him," +
                    " Isshiki opted not to revive himself in him, instead waiting until a more suitable vessel could be found.\n"+
                    "In time, Isshiki used Jigen's body to form a clandestine organisation to help achieve his goal, dubbed Kara. Eventually Jigen found and purchased Kawaki from his abusive father with a large sum of money, to use as a potential new vessel. After taking custody of the boy, Jigen introduced himself as his new father and reassured him. He would later attempt to transfer Kāma to Kawaki and fourteen other boys in an experiment conducted with the help of the Kara scientist Amado, with Kawaki being the only known success and thirteen dying outright. Despite promising him safety, Jigen put Kawaki through gruelling training to master the Kāma and would constantly berate him as only having value as a vessel, striking the boy whenever he questioned him. As with the rest of Kara, Jigen also had his body extensively modified by Amado's Scientific Ninja Tools. Isshiki plotted to feed Jigen, along with himself still living within the monk's body, to the Ten-Tails, in order to fulfill the requirements to have it bloom into a God Tree," +
                    " despite the resultant Chakra Fruit will be of lower quality due to the sacrifice's poor health and strength."
    };



    private static int[] heroesImages = {
            R.drawable.thanos,
            R.drawable.ultron,
            R.drawable.loki,
            R.drawable.zemo,
            R.drawable.redskull,
            R.drawable.venom,
            R.drawable.mysterio,
            R.drawable.doc,
            R.drawable.greengoblin,
            R.drawable.jigen
    };

    static ArrayList<Hero> getListData() {
        ArrayList<Hero> list = new ArrayList<>();
        for (int position = 0; position < heroNames.length; position++) {
            Hero hero = new Hero();
            hero.setName(heroNames[position]);
            hero.setDetail(heroDetails[position]);
            hero.setPhoto(heroesImages[position]);
            list.add(hero);
        }
        return list;
    }

    static Hero getDataIndex(int position) {
        Hero hero = new Hero();
        hero.setName(heroNames[position]);
        hero.setDetail(heroDetails[position]);
        hero.setPhoto(heroesImages[position]);
        return hero;
    }
}