

public class GeneticAlgorithmsApp {

	public static void main(String[] args) {
		
        GeneticAlgorithm algorithm = new GeneticAlgorithm();
        Population population = new Population(100);
        population.initialize();
        
        int generationCount = 0;
        
        while (population.getFittest().getFitness() != Constants.MAX_FITNESS) {
            ++generationCount;
            System.out.println("Generation: " + generationCount + " Fittest: " + population.getFittest().getFitness());
            System.out.println(population.getFittest()+"\n");
            population = algorithm.evolvePopulation(population);
        }
        
        System.out.println("Solution found:");
        System.out.println(population.getFittest());

    }
}
/*
Generation: 1 Fittest: 7
15237543884029734689

Generation: 2 Fittest: 7
44213784492123487762

Generation: 3 Fittest: 9
61234197887029557880

Generation: 4 Fittest: 10
61436937190105426786

Generation: 5 Fittest: 13
41244664490123752789

Generation: 6 Fittest: 13
41284664490123152789

Generation: 7 Fittest: 14
11264967890123457587

Generation: 8 Fittest: 15
01234567850163225789

Generation: 9 Fittest: 16
01234567790133255789

Generation: 10 Fittest: 14
01534663880123456169

Generation: 11 Fittest: 16
01234567846123450786

Generation: 12 Fittest: 17
08234567890123454786

Generation: 13 Fittest: 16
08234567890126454786

Generation: 14 Fittest: 16
07234567890126454786

Generation: 15 Fittest: 17
01234567880823406789

Generation: 16 Fittest: 18
01934567880123456789

Generation: 17 Fittest: 18
01234567890823456786

Generation: 18 Fittest: 18
01234567890823456786

Generation: 19 Fittest: 18
01234567290823456789

Generation: 20 Fittest: 17
01234567890823456549

Generation: 21 Fittest: 18
01234567890123453749

Generation: 22 Fittest: 18
01234567890123453729

Generation: 23 Fittest: 18
01294567899123456789

Generation: 24 Fittest: 18
01234567890823456759

Generation: 25 Fittest: 18
01234567690163456789

Generation: 26 Fittest: 17
02234527690123456789

Generation: 27 Fittest: 18
01234567890173256789

Generation: 28 Fittest: 18
02234567892123456789

Generation: 29 Fittest: 18
01234567893123456780

Generation: 30 Fittest: 18
01234562893123456789

Generation: 31 Fittest: 18
81234567892123456789

Generation: 32 Fittest: 18
01239567890113456789

Generation: 33 Fittest: 19
01234567890123452789

Generation: 34 Fittest: 18
01234567890123452729

Generation: 35 Fittest: 18
01234567890123452780

Generation: 36 Fittest: 17
01234267890123459781

Generation: 37 Fittest: 19
01234567690123456789

Generation: 38 Fittest: 18
01234567694123456789

Generation: 39 Fittest: 19
01234567800123456789

Generation: 40 Fittest: 18
61234567800123456789

Generation: 41 Fittest: 19
01234567850123456789

Generation: 42 Fittest: 18
01234566590123456789

Generation: 43 Fittest: 18
01234566590123456789

Generation: 44 Fittest: 19
01234467890123456789

Generation: 45 Fittest: 18
01334567892123456789

Generation: 46 Fittest: 18
01233567890123756789

Generation: 47 Fittest: 18
01234567890223456489

Generation: 48 Fittest: 18
01234567830123756789

Generation: 49 Fittest: 18
01234567040123456789

Generation: 50 Fittest: 18
01234527840123456789

Generation: 51 Fittest: 18
01234267890223456789

Generation: 52 Fittest: 19
01234167890123456789

Generation: 53 Fittest: 19
01254567890123456789

Generation: 54 Fittest: 18
01834567810123456789

Generation: 55 Fittest: 19
01238567890123456789

Generation: 56 Fittest: 18
01234567890123956589

Generation: 57 Fittest: 19
01234567890123456781

Generation: 58 Fittest: 18
01234569490123456789

Generation: 59 Fittest: 18
61234567890123456749

Generation: 60 Fittest: 19
01234567890823456789

Generation: 61 Fittest: 18
01238567890123456749

Generation: 62 Fittest: 17
02234567890123956739

Generation: 63 Fittest: 18
01234567890127456729

Generation: 64 Fittest: 17
01834567890127456729

Generation: 65 Fittest: 18
01232567890123456779

Generation: 66 Fittest: 18
01934567830123456789

Generation: 67 Fittest: 17
01234967830124456789

Generation: 68 Fittest: 17
41234567830523456789

Generation: 69 Fittest: 19
01234567890123456709

Generation: 70 Fittest: 18
01239567890123456709

Generation: 71 Fittest: 17
01234567831123456739

Generation: 72 Fittest: 17
01034567890123456909

Generation: 73 Fittest: 18
01234567830163456789

Generation: 74 Fittest: 18
31234567890125456789

Generation: 75 Fittest: 17
01234577890163456769

Generation: 76 Fittest: 18
01234967890123406789

Generation: 77 Fittest: 17
01234577890163456729

Generation: 78 Fittest: 19
01234567890123456769

Generation: 79 Fittest: 18
61234567590123456789

Generation: 80 Fittest: 18
01234867890123256789

Generation: 81 Fittest: 18
01234567790123256789

Generation: 82 Fittest: 18
01234567890823456799

Generation: 83 Fittest: 19
11234567890123456789

Generation: 84 Fittest: 18
01234567890123856749

Generation: 85 Fittest: 18
01234568894123456789

Generation: 86 Fittest: 18
01234567896123056789

Generation: 87 Fittest: 17
01734167890123456589

Generation: 88 Fittest: 19
01234567890123456769

Generation: 89 Fittest: 18
01234567860125456789

Generation: 90 Fittest: 17
01234567890123346389

Generation: 91 Fittest: 18
00234567890123456289

Generation: 92 Fittest: 17
61234867890123456989

Generation: 93 Fittest: 16
09934567890195456789

Generation: 94 Fittest: 17
01234567876120456789

Generation: 95 Fittest: 18
01234567890123756729

Generation: 96 Fittest: 17
01234567890123656429

Generation: 97 Fittest: 18
01274567890183456789

Generation: 98 Fittest: 18
01294567890183456789

Generation: 99 Fittest: 17
01234567890123756429

Generation: 100 Fittest: 18
01234567890723456783

Generation: 101 Fittest: 18
41234567390123456789

Generation: 102 Fittest: 17
01234587890123486784

Generation: 103 Fittest: 18
01234562890123456788

Generation: 104 Fittest: 17
11234562890123456788

Generation: 105 Fittest: 17
01234367803123456789

Generation: 106 Fittest: 17
01234563896163456789

Generation: 107 Fittest: 17
01234967890123444789

Generation: 108 Fittest: 18
01234567830123456786

Generation: 109 Fittest: 18
01224567890123456729

Generation: 110 Fittest: 17
01234567890123446669

Generation: 111 Fittest: 19
01234561890123456789

Generation: 112 Fittest: 19
01234567990123456789

Generation: 113 Fittest: 19
01234567880123456789

Generation: 114 Fittest: 19
01264567890123456789

Generation: 115 Fittest: 19
01234567890123756789

Generation: 116 Fittest: 19
01234567880123456789

Generation: 117 Fittest: 18
01139567890123456789

Generation: 118 Fittest: 18
31234564890123456789

Generation: 119 Fittest: 18
01234567890123016789

Generation: 120 Fittest: 18
31034567890123456789

Generation: 121 Fittest: 18
01234567890123056739

Generation: 122 Fittest: 19
01234567890123456729

Generation: 123 Fittest: 19
01034567890123456789

Generation: 124 Fittest: 18
01034567890129456789

Generation: 125 Fittest: 18
71234567870123456789

Generation: 126 Fittest: 18
00234167890123456789

Generation: 127 Fittest: 19
01234567790123456789

Generation: 128 Fittest: 18
01234567890153456799

Generation: 129 Fittest: 19
01234567890123456749

Generation: 130 Fittest: 18
01234567860823456789

Generation: 131 Fittest: 18
01234667860123456789

Generation: 132 Fittest: 17
01234567890129056780

Generation: 133 Fittest: 17
01234467860123456689

Generation: 134 Fittest: 18
81234568890123456789

Generation: 135 Fittest: 18
01234567840123456689

Generation: 136 Fittest: 17
01284567890183456689

Generation: 137 Fittest: 18
01234564890123456689

Generation: 138 Fittest: 18
01234567399123456789

Generation: 139 Fittest: 18
04234567890123456689

Generation: 140 Fittest: 17
01234564890129406789

Generation: 141 Fittest: 18
01234567890123495789

Generation: 142 Fittest: 18
04234567820123456789

Generation: 143 Fittest: 19
01234567810123456789

Generation: 144 Fittest: 18
51234507890123456789

Generation: 145 Fittest: 18
01234564810123456789

Generation: 146 Fittest: 18
01234507890123056789

Generation: 147 Fittest: 19
01234567891123456789

Generation: 148 Fittest: 19
01234567894123456789

Generation: 149 Fittest: 18
05234527890123456789

Generation: 150 Fittest: 19
09234567890123456789

Generation: 151 Fittest: 19
01234557890123456789

Generation: 152 Fittest: 18
01233567860123456789

Generation: 153 Fittest: 18
01234567860123456739

Generation: 154 Fittest: 18
01234557890823456789

Generation: 155 Fittest: 19
01234557890123456789

Generation: 156 Fittest: 19
08234567890123456789

Generation: 157 Fittest: 19
01234567890123756789

Generation: 158 Fittest: 19
01234567850123456789

Generation: 159 Fittest: 18
01234567850123456289

Generation: 160 Fittest: 18
01234577890120456789

Generation: 161 Fittest: 19
01234527890123456789

Generation: 162 Fittest: 17
01234568890163256789

Generation: 163 Fittest: 18
01234567890129556789

Generation: 164 Fittest: 18
01234467890823456789

Generation: 165 Fittest: 18
01234567895123486789

Generation: 166 Fittest: 18
01234569890123454789

Generation: 167 Fittest: 18
01254567790123456789

Generation: 168 Fittest: 19
08234567890123456789

Generation: 169 Fittest: 18
01234967895123456789

Generation: 170 Fittest: 19
01234567890183456789

Generation: 171 Fittest: 18
01204567890123486789

Generation: 172 Fittest: 18
01434567890126456789

Generation: 173 Fittest: 18
01234567890123686789

Generation: 174 Fittest: 18
01234577890123456784

Generation: 175 Fittest: 18
01234527890126456789

Generation: 176 Fittest: 17
01234568890123356781

Generation: 177 Fittest: 18
01334527890123456789

Generation: 178 Fittest: 18
01730567890123456789

Generation: 179 Fittest: 17
01234577894129456789

Generation: 180 Fittest: 19
01234567890123446789

Generation: 181 Fittest: 19
01234567890123556789

Generation: 182 Fittest: 19
01234567890123456689

Generation: 183 Fittest: 18
07234567890123456889

Generation: 184 Fittest: 19
01734567890123456789

Generation: 185 Fittest: 19
01234567890125456789

Generation: 186 Fittest: 19
01234567890123056789

Generation: 187 Fittest: 18
01634567890123456782

Generation: 188 Fittest: 17
01634567890123456882

Solution found:
01234567890123456789
 */