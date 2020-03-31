def sameNecklace(word1, word2):
    verdict = False

    word1Length, word2Length = (len(word1), len(word2))
    if word1Length != word2Length:
        return False

    index = 0
    same = False
    while index<word1Length:
        m = 0
        t = index
        limit = word2Length + index
        for t in range(t, limit):
            if word1[m]==word2[t%word1Length]:
                same = True
                m += 1
            elif word1[m]!=word2[t%word1Length]:
                same = False
                break
        if same==False:
            index += 1
        elif same==True:
            verdict = True
            break
    return verdict





list = ['lutelyabso', 'ssibleacce', 'vitiesacti', 'tionaladdi', 'rdableaffo', 
	'rentlyappa', 'aranceappe', 'icableappl', 'icantsappl', 'eciateappr', 
	'ssmentasse', 'stanceassi', 'ciatedasso', 'sphereatmo', 'activeattr', 
	'groundback', 'etballbask', 'nessesbusi', 'idatescand', 'goriescate', 
	'lengeschal', 'acterschar', 'ectioncoll', 'ercialcomm', 'issioncomm', 
	'itmentcomm', 'arisoncomp', 'atiblecomp', 'letelycomp', 'letioncomp', 
	'liancecomp', 'onentscomp', 'lusionconc', 'itionscond', 'erenceconf', 
	'idenceconf', 'ectionconn', 'ideredcons', 'istentcons', 'tantlycons', 
	'ainingcont', 'inuouscont', 'ributecont', 'rollercont', 'enientconv', 
	'ersionconv', 'iculumcurr', 'nitelydefi', 'nitiondefi', 'rtmentdepa', 'eduresproc']

origin = ['absolutely', 'accessible', 'activities', 'additional', 'affordable', 
	  'apparently', 'appearance', 'applicable', 'applicants', 'appreciate', 
	  'assessment', 'assistance', 'associated', 'atmosphere', 'attractive', 
	  'background', 'basketball', 'businesses', 'candidates', 'categories', 
	  'challenges', 'characters', 'collection', 'commercial', 'commission', 
	  'commitment', 'comparison', 'compatible', 'completely', 'completion', 
	  'compliance', 'components', 'conclusion', 'conditions', 'conference', 
	  'confidence', 'connection', 'considered', 'consistent', 'constantly', 
	  'containing', 'continuous', 'contribute', 'controller', 'convenient', 
	  'conversion', 'curriculum', 'definitely', 'definition', 'department', 'procedures']


for i in range(len(origin)):
	print(sameNecklace(list[i], origin[i]))
