package Exercises.ch03_Tmplate.ex03_04;

public class StringDisplay implements AbstractDisplay {    // StringDisplay���AAbstractDisplay�̃T�u�N���X�B
    private String string;                              // �\������ׂ�������B
    private int width;                                  // �o�C�g�P�ʂŌv�Z����������́u���v�B
    public StringDisplay(String string) {               // �R���X�g���N�^�œn���ꂽ������string���A
        this.string = string;                           // �t�B�[���h�ɋL���B
        this.width = string.getBytes().length;          // ���ꂩ��o�C�g�P�ʂ̕����t�B�[���h�ɋL�����Ă����āA��Ŏg���B
    }
    public void open() {                                // �I�[�o�[���C�h���Ē�`����open���\�b�h�B
        printLine();                                    // ���̃N���X�̃��\�b�hprintLine�Ő����Ă���B
    }
    public void print() {                               // print���\�b�h�́A
        System.out.println("|" + string + "|");         // �t�B�[���h�ɋL�����Ă�����������̑O���"|"�����ĕ\���B
    }
    public void close() {                               // close���\�b�h�́A
        printLine();                                    // open�Ɠ�����printLine���\�b�h�Ő����Ă���B
    }
    private void printLine() {                          // open��close����Ă΂��printLine���\�b�h���Bprivate�Ȃ̂ŁA���̃N���X�̒������Ŏg����B
        System.out.print("+");                          // �g�̊p��\������"+"�}�[�N��\���B
        for (int i = 0; i < width; i++) {               // width��"-"��\�����āA
            System.out.print("-");                      // �g��Ƃ��ėp����B
        }
        System.out.println("+");                        // �g�̊p��\������"+"�}�[�N��\���B
    }
}
