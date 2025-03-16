package presentation;

import entity.ProgrammingLanguage;
import entity.Technology;
import repository.concrete.inMemory.InMemoryProgrammingLanguageRepository;
import repository.concrete.inMemory.InMemoryTechnologyRepository;
import service.abstracts.ProgrammingLanguageService;
import service.abstracts.TechnologyService;
import service.concrete.ProgrammingLanguageImpl;
import service.concrete.TechnologyImpl;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ProgrammingLanguageService programmingLanguageService = new ProgrammingLanguageImpl(new InMemoryProgrammingLanguageRepository());
        TechnologyService technologyService = new TechnologyImpl(new InMemoryTechnologyRepository());

        while (true){
            System.out.println("Programlama Dilleri ve Bu Dillere Ait Teknolojilerin Yönetimi");
            System.out.println("1 - Programlama Dili Ekle");
            System.out.println("2 - Programlama Dili Listele");
            System.out.println("3 - Programlama Dili Güncelle");
            System.out.println("4 - Programlama Dili Sil");
            System.out.println("5 - Teknoloji Ekle");
            System.out.println("6 - Teknolojileri Listele");
            System.out.println("7 - Teknolojiyi Güncelle");
            System.out.println("8 - Teknolojiyi Sil");
            System.out.println("9 - Çıkış");
            System.out.print("Seçiminiz: ");

            int choice = scanner.nextInt();

            switch (choice){
                case 1:
                    System.out.print("Programlama Dili ID: ");
                    int langId = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Programlama Dili Adı: ");
                    String langName = scanner.nextLine();
                    programmingLanguageService.add(new ProgrammingLanguage(langId, langName));
                    break;
                case 2:
                    System.out.println("Programlama Dilleri Detayları");
                    programmingLanguageService.getAll();
                    break;
                case 3:
                    System.out.print("Güncellenecek Programlama Dili ID : ");
                    int id = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Güncellenecek Programlama Dili Adı : ");
                    String updateLangName = scanner.nextLine();
                    programmingLanguageService.update(new ProgrammingLanguage(id, updateLangName));
                    break;
                case 4:
                    System.out.print("Silinecek Programlama Dili ID : ");
                    int delLangId = scanner.nextInt();
                    scanner.nextLine();
                    programmingLanguageService.delete(delLangId);
                    break;
                case 5:
                    System.out.print("Teknoloji ID : ");
                    int addLangId = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Teknoloji Adı: ");
                    String addTechName = scanner.nextLine();
                    System.out.print("Bağlı Olduğu Programlama Dili ID: ");
                    int techLangId = scanner.nextInt();
                    scanner.nextLine();
                    Technology technology = new Technology(addLangId, addTechName, programmingLanguageService.getById(techLangId));
                    technologyService.add(technology);
                    break;
                case 6:
                    System.out.println("Tekonoloji Detayları : ");
                    technologyService.getAll();
                    break;
                case 7:
                    System.out.print("Güncellenecek Teknoloji ID : ");
                    int updateTechid = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Güncellenecek Teknoloji  Adı : ");
                    String updateTechName = scanner.nextLine();
                    System.out.print("Bağlı Olduğu Programlama Dili ID: ");
                    int updateTechLangId = scanner.nextInt();
                    scanner.nextLine();
                    Technology updatedTech  = new Technology(updateTechid, updateTechName, programmingLanguageService.getById(updateTechLangId));
                    technologyService.update(updatedTech );
                    break;
                case 8:
                    System.out.print("Silinecek Teknoloji ID : ");
                    int deleteTechId = scanner.nextInt();
                    technologyService.delete(deleteTechId);
                    break;
                case 9:
                    System.out.println("Çıkış yapılıyor...");
                    return;
                default:
                    System.out.println("Geçerli bir seçenek seçiniz.");
            }
        }
    }
}