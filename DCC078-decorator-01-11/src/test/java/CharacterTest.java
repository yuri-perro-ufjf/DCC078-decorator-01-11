import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CharacterTest {

    @Test
    void shouldBeReturnCharacterDamage(){
        Character chr = new CharacterImplements(100.5f);

        assertEquals(100.5f, chr.getCharacterDamage());
    }

    @Test
    void shouldBeReturnCharacterDamageWithKungFu(){
        Character chr = new KungFuCharacter(new CharacterImplements(80.5f));

        assertEquals(180.5f, chr.getCharacterDamage());
    }

    @Test
    void shouldBeReturnCharacterDamageWithJudo(){
        Character chr = new JudoCharacter(new CharacterImplements(80.5f));

        assertEquals(131.0f, chr.getCharacterDamage());
    }

    @Test
    void shouldBeReturnCharacterDamageWithKungFuAndJudo(){
        Character chr = new KungFuCharacter(new JudoCharacter(new CharacterImplements(80.5f)));

        assertEquals(231.0f, chr.getCharacterDamage());
    }
}