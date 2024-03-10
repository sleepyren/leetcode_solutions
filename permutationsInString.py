class Solution(object):
    def checkInclusion(self, s1, s2):
        if len(s1) > len(s2): return False
        permLen = len(s1)
        s1Count = [0] * 26
        s2Count = [0] * 26
        '''
        Code seems convoluted but its basically noting that permutations must be in order. Therefore if s2 contains a permutation of s1 then it must be consecutive. Therefore
        we can analyze subsets of size s1 and check if they are permutations by simply counting the letter count

        this: s1Count[ord(s1[i])- ord('a')]
        basically says take the letter found at i, get its unicode #
        but subtract the unicode of 'a' so we can get it 0-indexed
        then put it in the alphabet count array s1Count
        '''
        for i in range(permLen):
            s1Count[ord(s1[i])- ord('a')] = s1Count[ord(s1[i]) - ord('a')] + 1
            s2Count[ord(s2[i])- ord('a')] = s2Count[ord(s2[i])- ord('a')] + 1

        if s1Count == s2Count: return True

        for i in range(permLen, len(s2)):
            # remove the i - permLenth term, add the ith term
            s2Count[ord(s2[i - permLen])- ord('a')] = s2Count[ord(s2[i - permLen])- ord('a')] - 1
            s2Count[ord(s2[i])- ord('a')] = s2Count[ord(s2[i])- ord('a')] + 1

            if s1Count == s2Count: return True

        return False

##permutationsInString medium O(N)
