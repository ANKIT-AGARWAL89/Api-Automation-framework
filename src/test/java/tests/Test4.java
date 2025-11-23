package tests;

import AnkitLearningPath.models.pet.requests.Category;
import AnkitLearningPath.models.pet.requests.PetRequest;
import AnkitLearningPath.models.pet.requests.Tag;
import AnkitLearningPath.services.PetServices;
import AnkitLearningPath.util.RetryAnalyzer;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Test4 {
    @Test
    public void addNewPetInStore() {

        Category category = Category.builder()
                .id(0).name("Hybrid").build();

        Tag tag1 = Tag.builder().id(0).name("beauty").build();
        Tag tag2 = Tag.builder().id(1).name("cutie").build();
        List<Tag> tagList = new ArrayList<>();
        tagList.add(tag1);
        tagList.add(tag2);

        PetRequest petRequest = PetRequest.builder()
                .id(0).name("tommy").photoUrls(Collections.singletonList("jsndn"))
                .status("available").category(category).tags(tagList).build();
        PetServices.addpet(petRequest);
    }
    @Test(retryAnalyzer = RetryAnalyzer.class)
    public void ke(){
        Assert.assertTrue(false);
    }
    @Test(dependsOnMethods = "ke")
    public void ka(){
        Assert.assertTrue(false);
    }
}
