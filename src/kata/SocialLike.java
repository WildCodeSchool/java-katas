public class SocialLike {

    public static String like(String[] names) {
        
        if (names.length == 1) {
            return names[0] + " like this";
        }
        if (names.length == 2) {
            return names[0] + " and " + names[1] + " like this";
        }
        if (names.length > 2) {
            return names[0] + " and " + (names.length - 1) + " other people like this";
        }

        return "Be the first to like this";
    }
}
