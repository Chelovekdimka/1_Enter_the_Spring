package com.ex_02;

public class Knight {
    private Quest quest;

    public Knight(Quest quest) {
        this.quest = quest;
    }

    public void setQuest(Quest quest) {
        this.quest = quest;
    }

    public void embarkOnQuest() {
        System.out.println("Лицар розпочинає квест!");
        quest.perform();
        System.out.println("Лицар завершив квест!");
    }
}
