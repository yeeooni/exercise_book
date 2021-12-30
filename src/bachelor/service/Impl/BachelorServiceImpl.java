package bachelor.service.Impl;

import bachelor.common.CommonUtils;
import bachelor.service.BachelorService;
import bachelor.vo.BachelorVO;

import java.io.*;
import java.util.*;

/**
 * Created by IntelliJ IDEA.
 * User: ddochi
 * Date: 2021-12-30
 * Time: 오후 12:46
 * Luck is the residue of design. -Branch Rickey
 * <PRE>exercise_book|</PRE>
 */
public class BachelorServiceImpl implements BachelorService {

    private List<BachelorVO> list = new ArrayList<BachelorVO>();
    private static String jobs [] = {"학번", "과목", "부서"};
    private BufferedReader br;

    public BachelorServiceImpl () {
        br = new BufferedReader(new InputStreamReader(System.in));
    }

    @Override
    public void viewMenu() {
        System.out.println("//==============//");
        System.out.println("메뉴 선택");
        System.out.println("1. 등록");
        System.out.println("2. 찾기");
        System.out.println("3. 삭제");
        System.out.println("4. 전체 출력");
        System.out.println("//==============//");
        System.out.println("0. 종료");
        System.out.println("//==============//");
        try {
            System.out.println("번호를 선택해주세요 :");
            String str = br.readLine();
            switch (str) {
                case "1" :
                    registerMenu();
                    break;
                case "2" :
                    findMenu();
                    break;
                case "3" :
                    deleteMenu();
                    break;
                case "4" :
                    selectAll();
                    break;
                case "0" :
                    exit();
                    break;
                default: System.out.println("번호를 재선택 해주세요.");
                    viewMenu();
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {

        }

    }

    @Override
    public void registerMenu() {
        String number = null, value = null, firstAge = null;
        int age = 0;
        System.out.println("//==============//");
        System.out.println("1.학생\n 2.교수\n3.관리자\n4.이전메뉴");
        System.out.println("번호를 선택해주세요 :");
        try {
            number = br.readLine().trim();
            switch (number) {
                case "1" :
                    while(true) {
                        System.out.println("나이 :");
                        firstAge = br.readLine().trim();
                        if(CommonUtils.isNumber(firstAge)){
                            age = Integer.parseInt(firstAge);
                            break;
                        } else {
                            System.out.println("숫자가 아니므로, 재입력해주세요.");
                        }
                    }
                    System.out.println("이름 :");
                    String name =  br.readLine().trim();
                    System.out.println("학번 :");
                    value = br.readLine().trim();
                    register(new BachelorVO(age, name, Integer.parseInt(number) - 1, value));
                    this.viewMenu();
                    break;
                case "2" :
                    System.out.println("나이 :");
                    age = Integer.parseInt(br.readLine().trim());
                    System.out.println("이름 :");
                    name = br.readLine().trim();
                    System.out.println("과목 :");
                    value = br.readLine().trim();
                    register(new BachelorVO(age, name, Integer.parseInt(number) - 1, value));
                    this.viewMenu();
                    break;
                case "3" :
                    System.out.println("나이 :");
                    age = Integer.parseInt(br.readLine().trim());
                    System.out.println("이름 :");
                    name = br.readLine().trim();
                    System.out.println("부서 :");
                    value = br.readLine().trim();
                    register(new BachelorVO(age, name, Integer.parseInt(number) - 1, value));
                    this.viewMenu();
                    break;
                case "4" :
                    this.viewMenu();
                    break;

                default: System.out.println("번호를 다시 선택해주세요.");
                        registerMenu();
            }

        } catch (IOException ie) {
            System.out.println(ie.getStackTrace());
        }
    }

    @Override
    public int register(BachelorVO bachelorVO) {
        list.add(bachelorVO);
        return list.size();
    }

    @Override
    public void findMenu() {
        try {
            System.out.println("찾을 이름을 입력해주세요.");
            String name = br.readLine().trim();
            BachelorVO vo = find(name);

            if(!vo.getName().isEmpty())
                System.out.println("나이 : " + vo.getAge() + "\t이름 :" + vo.getName() + "\t" + jobs[vo.getKey()] + "\t:" + vo.getName());
            this.input(br);
        } catch (IOException ie) {
            System.out.println(ie.getStackTrace());
        }
    }

    @Override
    public BachelorVO find(String name) {
        int size = list.size();
        for(int i = 0; i < size; i++)
            if(name.equals(list.get(i).getName()))
                return list.get(i);
        return null;
    }

    @Override
    public int deleteMenu() {
        System.out.println("삭제할 사람의 이름을 입력해주세요.");
        try {
            String name = br.readLine().trim();
            if (deleted(name) == 1)
                System.out.println(name + "님이 삭제되었습니다.");
            else if(deleted(name) == 0)
                System.out.println("삭제할 이름이 존재하지 않습니다.");
            this.input(br);
        } catch (IOException ie) {
            System.out.println(ie.getStackTrace());
        }
        return 0;
    }

    @Override
    public int deleted(String name) {
        int size = list.size();
        for(int i = 0; i < size; i++){
            if(name.equals(list.get(i).getName())){
                list.remove(i);
                return 1;
            }
        }
        return 0;
    }

    @Override
    public void selectAll() {
        int size = list.size();
        for(int i = 0; i < size; i++)
            System.out.println("나이 : " + list.get(i).getAge() + "\t이름 :" + list.get(i).getName() + "\t" + jobs[list.get(i).getKey()] + "\t:" + list.get(i).getName());
        this.input(br);
    }

    @Override
    public void exit() {
        System.out.println("프로그램을 종료합니다.");
        System.exit(0);
    }

    private void input (BufferedReader br) {
        System.out.println("계속 진행하시려면 1. 종료하시려면 0.");
        String input = null;
        try {
            input = br.readLine().trim();
            int checked = Integer.parseInt(input);
            if(checked == 1)
                viewMenu();
            else if(checked == 0)
                exit();
            else {
                System.out.println("숫자만 입력해주세요.");
                System.out.println("계속 진행하시려면 1. 종료하시려면 0.");
                input = br.readLine().trim();
                checked = Integer.parseInt(input);
                if(checked == 1)
                    viewMenu();
                else if(checked == 0)
                    exit();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
